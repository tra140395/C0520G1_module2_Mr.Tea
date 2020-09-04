<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/09/2020
  Time: 12:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h1>Edit User</h1>
<p>
    <a href="/user">Back to User list</a>
</p>
<form action="/user" method="post">
    <input type="hidden" name="action" value="edit">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" id="id" value="${user.id}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Mail:</td>
                <td><input type="text" name="email" id="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="country" value="${user.country}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Edit user" ></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
