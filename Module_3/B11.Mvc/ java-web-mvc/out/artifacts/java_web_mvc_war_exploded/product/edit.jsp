<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${message!= null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to Products list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id" id="id" value="${requestScope["product"].getId()}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Gia:</td>
                <td><input type="text" name="gia" id="gia" value="${requestScope["product"].getGia()}"></td>
            </tr>
            <tr>
                <td>Mo ta:</td>
                <td><input type="text" name="mota" id="mota" value="${requestScope["product"].getMoTa()}"></td>
            </tr>
            <tr>
                <td>Nha san xuat:</td>
                <td><input type="text" name="nhasx" id="nhasx" value="${requestScope["product"].getNhaSx()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Edit Product"></td>
            </tr>

        </table>
    </fieldset>

</form>
</body>
</html>
