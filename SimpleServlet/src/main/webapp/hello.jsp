<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jsltpg" uri="/WEB-INF/HelloTag.tld"%>
<html>
<head>
    <title>Hello world</title>
</head>
<body>
    <h1>
       <jsltpg:hello name='<%=request.getParameter("name")%>' />
    </h1>
</body>
</html>
