<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/09/2020
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create form</title>
</head>
<body>
<a href="/student">Back to list</a>
<form action="/product" method="post">
    <input type="hidden" name="action" value="create_product">
    <fieldset>
        <legend><h2>Product information</h2></legend>
        <p></p>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" placeholder="name..."></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" placeholder="price..."></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="quantity" placeholder="quantity..."></td>
            </tr>
            <tr>
                <td>Color:</td>
                <td><input type="text" name="color" placeholder="color..."></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" placeholder="description..."></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><input type="text" name="category" placeholder="category..."></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create new Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
