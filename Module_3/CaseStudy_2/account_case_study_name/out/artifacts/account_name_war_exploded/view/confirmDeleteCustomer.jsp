<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/09/2020
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm delete</title>
</head>
<body>
<h2 style="color: #0c5460">Confirm Page</h2>
<form>
    <table border="1">
        <tr style="color: brown">
            <td>Id</td>
            <td>Type_Id</td>
            <td>Name</td>
            <td>Birthday</td>
            <td>Gender</td>
            <td>Id_card</td>
            <td>Phone</td>
            <td>Email</td>
            <td>Address</td>
        </tr>
        <tr>
            <td>${customer.customer_id}</td>
            <td>${customer.customer_type_id}</td>
            <td>${customer.customer_name}</td>
            <td>${customer.customer_birthday}</td>
            <td>${customer.customer_gender}</td>
            <td>${customer.customer_id_card}</td>
            <td>${customer.customer_phone}</td>
            <td>${customer.customer_email}</td>
            <td>${customer.customer_address}</td>
        </tr>
    </table>
    <h2>You sure to delete this Customer??</h2>
    <a href="/account?action=yes&id=${customer.customer_id}">Yes</a>
    <a href="/account?action=no">No</a>
</form>
</body>
</html>
