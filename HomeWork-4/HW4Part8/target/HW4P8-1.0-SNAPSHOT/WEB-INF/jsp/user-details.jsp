
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="user.htm" method="GET">
        User : ${requestScope.user.name}
        <br>
        Object ID : ${requestScope.objectID}
        <br><!-- comment -->
         String message : ${requestScope.info}
         <br>
        <input type="submit" value="Check ObjectID Again">
        </form>
        
       
    </body>
</html>
