
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Computers</title>
</head>
<body>
<div>Shop for Laptops</div>
<hr/>
<div>
    <p align="right">[<a href="ViewCart.jsp">View Cart</a>]</p>
</div>
<div>
    <form action="cart" method="post">
        <input type="checkbox" name="computers" value="Apple MacBook Pro with 13.3' Display[$1299.99]"/>
        Apple MacBook Pro with 13.3' Display[$1299.99]<br/>
        <input type="checkbox" name="computers" value="Asus Laptop with Centrino 2 Black[$949.95]"/>
        Asus Laptop with Centrino 2 Black[$949.95]<br/>
        <input type="checkbox" name="computers" value="HP Pavlion Laptop with Centrino 2 DV7[$1199.95]"/>
        HP Pavlion Laptop with Centrino 2 DV7[$1199.95]<br/>
        <input type="checkbox" name="computers" value="Toshiba Satellite Laptop with Centrino 2 - Copper[$899.99]"/>
        Toshiba Satellite Laptop with Centrino 2 - Copper[$899.99]<br/>
        <input type="checkbox" name="computers" value="Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$779.99]"/>
        Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$779.99]<br/>
        <input type="submit" name="submit" value="Add to Cart"/><br/>
    </form>
</div>
<a href="index.jsp">Back to Navigation Page</a>

</body>
</html>
