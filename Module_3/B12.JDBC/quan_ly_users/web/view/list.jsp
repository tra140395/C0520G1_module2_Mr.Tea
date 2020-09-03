<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/08/2020
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>User</title>
    <style>
        .hear {
            color: blue;
        }
    </style>
</head>
<body>
<h1 style="color:brown">User's List</h1>
<p>
    <a href="/user?action=create">Create new User</a>
</p>
<p>
    <a href="/user?action=search">Search User by country</a>
</p>
<p>
    <a href="/user?action=sort">Sort List users by name</a>
</p>
<table border="1">
    <tr class="hear">
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Country</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${userListServlet}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="/user?action=editById&id=${user.id}">Edit</a></td>
            <td><a href="/user?action=deleteById&id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="/user?action=showListProcedure">Show User List by Procedure</a>
</p>
<p>
    <a href="/user?action=swap">Swap id Transaction</a>
</p>

</body>
</html>
