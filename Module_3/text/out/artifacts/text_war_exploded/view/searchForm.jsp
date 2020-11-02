<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/09/2020
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>search</title>
</head>
<body>
<form action="/product" method="post">
    <input type="hidden" name="action" value="searchByName">
    <h3>Enter the name you want to search</h3>
    <input type="text" name="name" id="name" placeholder="Enter name..">
    <input type="submit" value="Search">
</form>
</body>
</html>
