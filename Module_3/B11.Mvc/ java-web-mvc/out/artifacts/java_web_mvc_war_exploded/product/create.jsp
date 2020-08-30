<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Create new Product</title>
    <style>
        .message {
            color: brown;
        }
    </style>
</head>
<body>
<p>
    <c:if test='${message != null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to Product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" id="id"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Gia:</td>
                <td><input type="text" name="gia" id="gia"></td>
            </tr>
            <tr>
                <td>Mo ta:</td>
                <td><input type="text" name="mota" id="mota"></td>
            </tr>
            <tr>
                <td>Nha sx:</td>
                <td><input type="text" name="nhasx" id="nhasx"></td>
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
