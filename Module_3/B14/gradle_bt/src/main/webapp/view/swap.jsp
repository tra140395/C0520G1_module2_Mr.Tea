<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/09/2020
  Time: 3:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Swap form</title>
</head>
<body>
 <h3>Swap id Transaction</h3>
 <form action="/user" method="post">

     <input type="hidden" name="action" value="swap">

     <label for="id_1">ID 1</label>
     <select name="id_1" id="id_1">
       <c:forEach items="${userList}" var="user">
         <option value="${user.id}">${user.id}</option>
       </c:forEach>
     </select>

     <label for="id_2">ID 2</label>
     <select name="id_2" id="id_2">
         <c:forEach items="${userList}" var="user">
             <option value="${user.id}">${user.id}</option>
         </c:forEach>
     </select>
     <input type="submit" value="Swap user">
 </form>

</body>
</html>
