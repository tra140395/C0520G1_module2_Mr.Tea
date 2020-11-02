<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/09/2020
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm</title>
</head>
<body>
<h2 style="color: #0c5460">Confirm Page</h2>
<form>
    <table border="1">
        <tr style="color: brown">
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
            <td>Quantity</td>
            <td>Color</td>
            <td>Description</td>
            <td>Category</td>
        </tr>
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>${product.color}</td>
            <td>${product.description}</td>
            <td>${product.category}</td>

        </tr>
    </table>
    <h2>You sure to delete this product??</h2>
    <a href="/product?action=yes&id=${product.id}">Yes</a>
    <a href="/product?action=no">No</a>
</form>
</body>
</html>
