<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/09/2020
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>search form</title>
</head>
<body>
<p>
    <a href="/user">Back to User list</a>
</p>
   <form action="/user" method="post">
       <input type="hidden" name="action" value="search">
       <input type="text" name="country" id="country">
       <input type="submit" value="Find User with this country" >
   </form>
</body>
</html>
