<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 12:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search customer</title>
</head>
<body>
<%@ include file="home.jsp"%>
<p></p>
  <h2>Enter id of Customer you want to search</h2>
  <form action="/account" method="post">
      <input type="hidden" name="action" value="searchCustomer">
      <input type="text" name="id" id="id" placeholder="Enter id here...">
      <input type="submit" value="Find now">
  </form>
</body>
</html>
