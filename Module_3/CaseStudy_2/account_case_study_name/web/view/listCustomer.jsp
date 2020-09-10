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
    <link rel="stylesheet" href="../lib_fe/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../lib_fe/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<%@ include file="home.jsp"%>
<p><a href="/account?action=searchCustomerById">Search Customer By Id</a></p>
<h3 style="color: blueviolet">List of Customer</h3>
<table id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
   <thead>
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
  </thead>

  <c:forEach items="${customerList}" var="customer">
    <tbody>
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
          <td><a href="/account?action=confirmDeleteCustomer&id=${customer.customer_id}">Delete</a></td>
      </tr>
    </tbody>
  </c:forEach>
</table>
<script src="../lib_fe/jquery/jquery-3.5.1.min.js"></script>
<script src="../lib_fe/datatables/js/jquery.dataTables.min.js"></script>
<script src="../lib_fe/datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function() {
        $('#tableCustomer').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
</body>
</html>
