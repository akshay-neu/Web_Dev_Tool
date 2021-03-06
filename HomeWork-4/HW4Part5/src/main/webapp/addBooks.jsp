
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Book Details</title>
    </head>
    <body style="background-color: yellow">
        <form action="books.htm" method="post">
            <table border="1px">
                <tr>
                    <td>ISBN</td>
                    <td>Book Title</td>
                    <td>Author</td>
                    <td>Price</td>
                </tr>
                <c:forEach begin="1" end="${requestScope.bookQuantity}">
                    <tr>
                        <td><input type="tel" name="isbn" maxlength="12" required/></td>
                        <td><input type="text" name="title" maxlength="60" required/></td>
                        <td><input type="text" name="authors" maxlength="60" required/></td>
                        <td><input type="number" name="price" min="0" name="price" required/></td>
                    </tr>
                </c:forEach>
                    <tr>
                        <td>
                            <input type="submit" value="Add Books" style="background-color: lightskyblue"/>
                            <input type="hidden" name="action" value="doAddBook" />                        
                        </td>
                    </tr>
            </table>
        </form>
    </body>
</html>
