<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/09/2020
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<a href="/product?action=create">Create new Product</a>
<h1>List of product</h1>
<table border="1" width="100%">
    <tr style="color: brown">
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Quantity</td>
        <td>Color</td>
        <td>Description</td>
        <td>Category</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>${product.color}</td>
            <td>${product.description}</td>
            <td>${product.category}</td>
            <td><a href="/product?action=edit&id=${product.id}">Edit</a></td>
            <td><a href="/product?action=delete&id=${product.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/product?action=searchByName">Search Product</a>
</body>
</html>
