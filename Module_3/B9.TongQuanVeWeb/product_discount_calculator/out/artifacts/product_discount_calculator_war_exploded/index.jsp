<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/08/2020
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Info</h2>
  <form action="/convert" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="info" placeholder="INFO"/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="PRICE" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="percent" placeholder="PERCENT" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Calculate"/>
  </form>
  </body>
</html>
