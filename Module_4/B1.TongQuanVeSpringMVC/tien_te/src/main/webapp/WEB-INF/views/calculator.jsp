<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/09/2020
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TinhToan</title>
</head>
<body>
<form action="/calculator" method="post">
    <input type="number" name="usd" value="${usd}">
    <input type="number" name="tigia" value="20000" readonly>
    <input type="number" name="vnd" value="${vnd}" readonly>
    <input type="submit" value="tinh" >
</form>
</body>
</html>
