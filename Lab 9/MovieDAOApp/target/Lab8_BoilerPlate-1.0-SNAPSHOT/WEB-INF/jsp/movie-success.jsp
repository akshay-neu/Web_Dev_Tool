<%-- 
    Document   : movie-successs
    Created on : Nov 6, 2021, 5:33:45 PM
    Author     : ysf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Following Movie was Saved Successfully</h1>
        Title: ${requestScope.movie.title}
    </body>
</html>
