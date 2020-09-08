<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/09/2020
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>create service</title>
</head>
<body>
<%@ include file="home.jsp"%>
<p></p>
<p>
    <c:if test='${message != null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<form action="/account" method="post">
    <input type="hidden" name="action" value="create_service">
    <fieldset>
        <legend>Service information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id"  placeholder="id"></td>
            </tr>
            <tr>
                <td>name:</td>
                <td><input type="text" name="name"  placeholder="name"></td>
            </tr>
            <tr>
                <td>Area:</td>
                <td><input type="text" name="area"  placeholder="area"></td>
            </tr>
            <tr>
                <td>Cost:</td>
                <td><input type="text" name="cost"  placeholder="cost"></td>
            </tr>
            <tr>
                <td>max_people:</td>
                <td><input type="text" name="max_people"  placeholder="max_people"></td>
            </tr>
            <tr>
                <td>rent_type_id:</td>
                <td><input type="text" name="rent_type_id"  placeholder="rent_type_id"></td>
            </tr>
            <tr>
                <td>service_type_id:</td>
                <td><input type="text" name="service_type_id"  placeholder="service_type_id"></td>
            </tr>
            <tr>
                <td>standard_room:</td>
                <td><input type="text" name="standard_room"  placeholder="standard_room"></td>
            </tr>
            <tr>
                <td>description_other_convenience:</td>
                <td><input type="text" name="description"  placeholder="description"></td>
            </tr>
            <tr>
                <td>pool_area:</td>
                <td><input type="text" name="pool_area"  placeholder="pool_area"></td>
            </tr>
            <tr>
                <td>number_of_floors:</td>
                <td><input type="text" name="number_of_floors"  placeholder="number_of_floors"></td>
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
