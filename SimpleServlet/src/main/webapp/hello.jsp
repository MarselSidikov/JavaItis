<%@ page import="java.util.List" %>
<%@ page import="ru.itis.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello world</title>
</head>
<body>
    <h1>
        <%
            List<User> users = (ArrayList<User>)request.getAttribute("myUsers");
        %>
        User: <%=users.get(0)%>
        User: <%=users.get(1)%>
        User: <%=users.get(2)%>
    </h1>
</body>
</html>
