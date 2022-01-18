

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        User : ${requestScope.user.name} 
        <br>
        ObjectID : ${requestScope.objectID}
        <br>
        String message : ${requestScope.info}
        <br>
        <a href="http://localhost:8080/HW4P9/index.htm">Click here to go back to main page</a>
        
       
    </body>
</html>
