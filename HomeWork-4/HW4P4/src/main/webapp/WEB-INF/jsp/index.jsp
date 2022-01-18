<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Store</title>
    </head>
    <body style="background-color:pink;">
        <h1>Welcome to our Movie Store</h1>
        <h3>Please make your selection below</h3>
        <form action="movie.htm" method="post">
            <select name="loginOption">
                <option value="browse">Browse Movies</option>
                <option value="add">Add New Movie to Database</option>
            </select>            
            <input type="submit" value="Submit"/>
            <input type="hidden" name="action" value="login" />
        </form>
    </body>
</html>
