<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
  <h1>Product information</h1>
  <p>
      <a href="/products">Back to products list</a>
  </p>
  <table>
      <tr>
          <td>Id:</td>
          <td>${requestScope["product"].getId()}</td>
      </tr>
      <tr>
          <td>Name:</td>
          <td>${requestScope["product"].getName()}</td>
      </tr>
      <tr>
          <td>Gia:</td>
          <td>${requestScope["product"].getGia()}</td>
      </tr>
      <tr>
          <td>Mo ta:</td>
          <td>${requestScope["product"].getMoTa()}</td>
      </tr>
      <tr>
          <td>Nha san xuat:</td>
          <td>$${requestScope["product"].getNhaSx()}</td>
      </tr>
      <tr>
          <td></td>
          <td><input type="submit" value="Delete Product"></td>
      </tr>

  </table>

</body>
</html>
