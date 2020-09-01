<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/08/2020
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    <h1>Confirm create new User success</h1>
    <h3>${user.id}</h3>
    <h3>${user.name}</h3>
    <h3>${user.mail}</h3>
    <h3>${user.country}</h3>
    <a href="/user">Back to list</a>
</body>
</html>
