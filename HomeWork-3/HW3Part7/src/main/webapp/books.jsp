<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books</title>
    </head>
    <body>
        <h1>How many books do you want to add?</h1>
        <form action="books.do" method="post">
            <input type="number" min="1" name="bookQuantity" required />
            <input type="submit" name="Submit" value="Submit"/>
            <input type="hidden" name="action" value="add"/>
        </form>
    </body>
</html>
