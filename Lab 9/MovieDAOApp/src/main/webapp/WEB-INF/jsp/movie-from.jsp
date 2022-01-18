<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create New Movie Form</h1>
        <form:form modelAttribute="movie">
            Title: <form:input path="title" /><br/>
            Actor: <form:input path="actor" /><br/>
            Actress: <form:input path="actress" /><br/>
            Genre: <form:input path="genre" /><br/>
            Year: <form:input path="year" /><br/>
            <input type="submit" value="SAVE MOVIE" />
        </form:form>
    </body>
</html>
