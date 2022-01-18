

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@page import="java.util.Date"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix = "fn" 
           uri = "http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Core Tag</h1>
        <%= session.getId()%>

        <c:forEach var="entry" items="${header}">
            <br>
            ${entry.key} - ${entry.value}
        </c:forEach>
        <br>
        <c:set var="salary" scope="page" value="${2000*2}" />

        <c:out value="${salary}" />

        <br><!-- comment -->
        <br><!-- comment -->

        <h1>Formatting Tag</h1>
        <c:set var = "balance" value = "56789.123456789" />
        <c:out value="${balance}" />
        <p>Formatted Number : <fmt:formatNumber value = "${balance}" type = "currency"/></p>
        <br><!-- comment -->
        <fmt:parseNumber var = "i" type = "number" value = "${balance}" />
        <p>Parsed Number : <c:out value = "${i}" /></p><!-- comment -->
        <c:set var = "now" value = "<%= new java.util.Date()%>" />
        <p>Formatted Date (1): <fmt:formatDate type = "time" 
                        value = "${now}" /></p>

        <h1>XML Tag</h1>
        <c:set var = "xmltext">
        <books>
            <book>
                <name>Servlet</name>
                <author>Pepe Jeans</author>
                <price>1000</price>
            </book>

            <book>
                <name>Java</name>
                <author>HUNA</author>
                <price>4000</price>
            </book>
        </books>
    </c:set>

    <x:parse xml = "${xmltext}" var = "output"/>
    <b>x:parse</b>: 
    <x:out select = "$output/books/book[1]/name" />
    <x:out select = "$output/books/book[2]/name" />
    <br>
    <x:if select = "$output//book">
        x:if tag
    </x:if>
    <br />


    <h1>JSTL Functions</h1>

    <c:set var = "theString1" value = "Contains method"/>
    <c:set var = "theString2" value = "containsIgnoreCase method"/>
    <c:set var = "theString3" value = "endsWith method"/>

    <c:if test = "${fn:contains(theString1, 'method')}">
        <p>Contains method<p>
        </c:if>

        <c:if test = "${fn:contains(theString1, 'TEST')}">
        <p> not Contains method<p>
        </c:if>

        <c:if test = "${fn:containsIgnoreCase(theString2, 'method')}">
        <p>containsIgnoreCase method<p>
        </c:if>

        <c:if test = "${fn:containsIgnoreCase(theString2, 'TEST')}">
        <p>not containsIgnoreCase method<p>
        </c:if>

        <c:if test = "${fn:endsWith(theString3, 'method')}">
        <p>endsWith method<p>
        </c:if>

        <c:if test = "${fn:endsWith(theString3, 'TEST')}">
        <p>not endsWith method<p>
        </c:if>

    <h1>SQL Tag</h1>
    <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                       url = "jdbc:mysql://localhost/moviesdb"
                       user = "root"  password = "root"/>

         <sql:update dataSource="${snapshot}" var="count">  
            INSERT INTO movie VALUES ('new2222','actor', 'actress','genre', 2021);  
        </sql:update> 

    
    <sql:query dataSource = "${snapshot}" var = "result">
        SELECT * from movie;
    </sql:query>

    <table border = "1" width = "100%">
        <tr>
            <th>title</th>
            <th>actor</th>
            <th>actress</th>
            <th>genre</th>
            <th>year</th>
        </tr>

        <c:forEach var = "row" items = "${result.rows}">
            <tr>
                <td> <c:out value = "${row.title}"/></td>
                <td> <c:out value = "${row.actor}"/></td>
                <td> <c:out value = "${row.actress}"/></td>
                <td> <c:out value = "${row.genre}"/></td>
                <td> <c:out value = "${row.year}"/></td>
            </tr>
        </c:forEach>
    </table>


        
   

</body>
</html>
