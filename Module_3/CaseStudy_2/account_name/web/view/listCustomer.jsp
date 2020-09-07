
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/09/2020
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<p><a href="/account?action=searchCustomerById">Search Customer By Id</a></p>
<h1 style="color: blueviolet">List of Customer</h1>
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
       <td>Edit</td>
       <td>Delete</td>
   </tr>
  <c:forEach items="${customerList}" var="customer">
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
          <td><a href="/account?action=editCustomer&id=${customer.customer_id}">Edit</a></td>
          <td><a href="/account?action=deleteCustomer&id=${customer.customer_id}">Delete</a></td>
      </tr>
  </c:forEach>
</table>
</body>
</html>
