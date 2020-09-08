<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/09/2020
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>create customer</title>
</head>
<body>
<%@ include file="home.jsp"%>
  <p></p>
  <p>
      <c:if test='${message != null}'>
          <span class="message" style="color: #1e7e34"><h3>${message}</h3></span>
      </c:if>
  </p>
 <form action="/account" method="post">
     <input type="hidden" name="action" value="create_customer">
     <fieldset>
         <legend><h2>Customer information</h2></legend>
         <table>
             <tr>
                 <td>Id:</td>
                 <td><input type="text" name="id"  placeholder="id"></td>
             </tr>
             <tr>
                 <td>Type_id:</td>
                 <td><input type="text" name="type_id"  placeholder="type_id"></td>
             </tr>
             <tr>
                 <td>Name:</td>
                 <td><input type="text" name="name"  placeholder="name"></td>
             </tr>
             <tr>
                 <td>Birthday:</td>
                 <td><input type="text" name="birthday"  placeholder="birthday"></td>
             </tr>
             <tr>
                 <td>Gender:</td>
                 <td><input type="text" name="gender"  placeholder="gender"></td>
             </tr>
             <tr>
                 <td>Id_card:</td>
                 <td><input type="text" name="id_card"  placeholder="id_card"></td>
             </tr>
             <tr>
                 <td>Phone:</td>
                 <td><input type="text" name="phone"  placeholder="phone"></td>
             </tr>
             <tr>
                 <td>Email:</td>
                 <td><input type="text" name="email"  placeholder="email"></td>
             </tr>
             <tr>
                 <td>Address:</td>
                 <td><input type="text" name="address"  placeholder="address"></td>
             </tr>
             <tr>
                 <td></td>
                 <td><input type="submit" value="Create new Customer"></td>
             </tr>
         </table>
     </fieldset>
 </form>
</body>
</html>
