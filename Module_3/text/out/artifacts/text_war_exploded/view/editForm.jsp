<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/09/2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="/product" method="post">
    <input type="hidden" name="action" value="edit">
    <fieldset>
        <legend>Edit Form</legend>
        <table border="1">
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id" readonly value="${product.id}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${product.name}"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value="${product.price}"></td>
            </tr>
            <tr>
                <td>Quantity:</td>
                <td><input type="text" name="quantity" value="${product.quantity}"></td>
            </tr>
            <tr>
                <td>Color:</td>
                <td><input type="text" name="color" value="${product.color}"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" value="${product.description}"></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><input type="text" name="category" value="${product.category}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Edit"></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>
