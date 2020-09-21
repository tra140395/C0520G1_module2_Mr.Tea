<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/09/2020
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>search</title>
</head>
<body>
<form action="/library" method="post">
    <input type="text" name="key" value="${key}">
    <input type="text" name ="word" value="${word}" readonly>
    <input type="submit" value="search">
</form>
</body>
</html>
