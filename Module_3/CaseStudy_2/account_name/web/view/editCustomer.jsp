<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 2:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
   <form method="post" action="/account">
       <input type="hidden" name="action" value="editCustomer">
       <fieldset>
           <legend>Customer Information</legend>
           <table>
               <tr>
                   <td>Id:</td>
                   <td><input type="text" name="id" id="id" value="${customer.customer_id}"></td>
               </tr>
               <tr>
                   <td>Type_id:</td>
                   <td><input type="text" name="type_id" id="type_id" value="${customer.customer_type_id}"></td>
               </tr>
               <tr>
                   <td>Name:</td>
                   <td><input type="text" name="name" id="name" value="${customer.customer_name}"></td>
               </tr>
               <tr>
                   <td>Birthday:</td>
                   <td><input type="text" name="birthday" id="birthday" value="${customer.customer_birthday}"></td>
               </tr>
               <tr>
                   <td>Gender:</td>
                   <td><input type="text" name="gender" id="gender" value="${customer.customer_gender}"></td>
               </tr>
               <tr>
                   <td>Id_card:</td>
                   <td><input type="text" name="id_card" id="id_card" value="${customer.customer_id_card}"></td>
               </tr>
               <tr>
                   <td>Phone</td>:</td>
                   <td><input type="text" name="phone" id="phone" value="${customer.customer_phone}"></td>
               </tr>
               <tr>
                   <td>Email:</td>
                   <td><input type="text" name="email" id="email" value="${customer.customer_email}"></td>
               </tr>
               <tr>
                   <td>Address:</td>
                   <td><input type="text" name="address" id="address" value="${customer.customer_address}"></td>
               </tr>
               <tr>
                   <td></td>
                   <td><input type="submit" value="Edit Customer" ></td>
               </tr>
           </table>
       </fieldset>
   </form>
</body>
</html>
