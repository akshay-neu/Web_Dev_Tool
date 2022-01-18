<%-- 
    Document   : registration
    Created on : Jul 17, 2021, 5:47:14 PM
    Author     : ysf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="pink">
        <jsp:scriptlet>
            String email = request.getParameter("email");
            String pswd = request.getParameter("password");
            String startdate = request.getParameter("startdate");
            String aboutme = request.getParameter("aboutme");
            String gender = request.getParameter("gender");
            String[] langs = request.getParameterValues("langs");
            String[] city = request.getParameterValues("city");
        </jsp:scriptlet>
       Below is your registration details: <br/>
       Email: <jsp:expression>email</jsp:expression><br/>
        Start Date: <%= startdate %><br/>
        About Me: <%= aboutme %><br/>
        Gender: <%= gender %><br/>
        Languages You Know:
        <ul>
        <%
            for (int i = 0; i < langs.length; i++) {
        %>
            <li><%= langs[i] %>
        <%
                }
                %>
            </ul>

            Location Preference:
            <ul>
                <%
            for (int i = 0; i < city.length; i++) {
                out.println(city[i]);
            }
            %>
            </ul>
            
    </body>
</html>
