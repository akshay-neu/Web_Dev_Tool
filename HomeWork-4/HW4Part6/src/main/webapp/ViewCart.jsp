

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ page import="java.util.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Cart</title>
</head>
<body>
    <c:set var="cart" value="${sessionScope.cart}"/>
    <h2 align="center"> View Your Cart</h2>
    <form action="cart" method="post">
        <table border="1" align="center">
            <c:if test="${cart != null}">
                <c:forEach var="item" items="${cart.cart}">
                    <tr>
                        <td>
                                ${item.name}
                        </td>
                        <td>
                            <input type="text" name="${item.name}" value="${item.count}"/>
                        </td>
                    </tr>

                </c:forEach>
            </c:if>
        </table>
        <input name="hidd" type="hidden" value="1">
        <br>
        <div align="center">
            <input type="submit" value="Submit" name="submit"/>
           
        </div>
    </form>
    <p>
<%--        [<a href="ViewCart.jsp">View Cart</a>]--%>
        [<a href="books.jsp">Go to Books Page</a>]
        [<a href="music.jsp">Go to Music Page</a>]
        [<a href="computers.jsp">Go to Computers Page</a>]
    </p>
    <a href="index.jsp">Back to Navigation Page</a>

</body>
</html>>
