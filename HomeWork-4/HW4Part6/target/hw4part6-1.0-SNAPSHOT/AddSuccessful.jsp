

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Successfully</title>
</head>
<body>
    <c:set var = "items" value="${sessionScope.items}"/>
    <c:choose>
        <c:when test="${items != null}">
            <h2>The following item has been added to your shopping cart successfully</h2>
            <c:forEach var="name" items="${items}">
                <p>${name}</p>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <h2>Please add items to your cart</h2>
        </c:otherwise>
    </c:choose>
    <p>
        [<a href="ViewCart.jsp">View Cart</a>]
        [<a href="books.jsp">Go to Books Page</a>]
        [<a href="music.jsp">Go to Music Page</a>]
        [<a href="computers.jsp">Go to Computers Page</a>]
    </p>
</body>
<a href="index.jsp">Back to Navigation Page</a>

</html>
