<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products list</title>
    <style>
        .header{
            background-color: chocolate;
        }
    </style>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
<table border="1">
     <tr class="header">
         <td>Id</td>
         <td>Tên</td>
         <td>Giá</td>
         <td>Mô tả</td>
         <td>Nhà sản xuất</td>
         <td>Edit</td>
         <td>Delete</td>
     </tr>
  <c:forEach items='${requestScope["products"]}' var="product">
      <tr>
      <td><a href="/products?action=view&id=${product.getId()}">${product.getId()}</a></td>
      <td>${product.getName()}</td>
      <td>${product.getGia()}</td>
      <td>${product.getMoTa()}</td>
      <td>${product.getNhaSx()}</td>
      <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
      <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
      </tr>
  </c:forEach>
</table>

</body>
</html>
