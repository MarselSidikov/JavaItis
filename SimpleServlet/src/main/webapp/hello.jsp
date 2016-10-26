<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello world</title>
</head>
<body>
    <h1>
        <!--
        <%
            response.addCookie(new Cookie("admin-name", "admin"));
            response.addCookie(new Cookie("admin-password", "admin"));
        %>
        -->
        <c:forEach items="${requestScope.myUsers}" var="currentUser">
            <tr>
                <td><c:out value="${currentUser.name}" /><td>
                <td><c:out value="${currentUser.age}" /><td>
            </tr>
        </c:forEach>
    </h1>
    <form action="hello" method="post">
        <input type="text" name="username">
        <input type="password" name="password">
        <input type="submit" value="login">
        <span class="error">${error}</span>
    </form>
</body>
</html>
