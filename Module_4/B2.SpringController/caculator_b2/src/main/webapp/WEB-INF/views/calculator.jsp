<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/09/2020
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
    <form action="/calculator" method="post">
        <input type="number" name="param1" value="${param1}">
        <input type="number" name="param2" value="${param2}">
        <input type="number" value="${result}" readonly>
        <select name="calculation">
            <option value="add" ${calculation=="add" ? "selected":""}>Add</option>
            <option value="sub" ${calculation=="sub" ? "selected":""}>Sub</option>
            <option value="mul" ${calculation=="mul" ? "selected":""}>Mul</option>
            <option value="div" ${calculation=="div" ? "selected":""}>Div</option>
        </select>
        <input type="submit" value="calculate">
    </form>
</body>
</html>  c
