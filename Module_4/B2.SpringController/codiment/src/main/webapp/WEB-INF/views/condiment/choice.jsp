<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/09/2020
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choice</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
  <form action="/condiment/save" method="post">
      <input type="checkbox" name="condiment" value="lettuce"><h4>Lettuce</h4>
      <input type="checkbox" name="condiment" value="tomato"><h4>Tomato</h4>
      <input type="checkbox" name="condiment" value="mustard"><h4>Mustard</h4>
      <input type="checkbox" name="condiment" value="sprouts"><h4>Sprouts</h4>
      <input type="submit" value="save">
  </form>
</body>
</html>
