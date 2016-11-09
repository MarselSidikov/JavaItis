<!-- обратите внимание на spring тэги -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

    <head>
        <title>Index Page</title>
    </head>

    <form action="show-user" method="post">
        <p>
            <input type="text" name="name">
            <input type="text" name="password">
            <input type="submit">
        </p>
    </form>
</html>