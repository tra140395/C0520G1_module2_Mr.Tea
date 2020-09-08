<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/09/2020
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new Employee</title>
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
    <input type="hidden" name="action" value="create_employee">
    <fieldset>
        <legend>Employee information</legend>
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
                <td>Birthday:</td>
                <td><input type="text" name="birthday"  placeholder="birthday"></td>
            </tr>
            <tr>
                <td>Id_card:</td>
                <td><input type="text" name="id_card"  placeholder="id_card"></td>
            </tr>
            <tr>
                <td>Salary</td>
                <td><input type="text" name="salary"  placeholder="salary"></td>
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
                <td>Position_id:</td>
                <td><input type="text" name="position_id"  placeholder="position_id"></td>
            </tr>
            <tr>
                <td>Education_id:</td>
                <td><input type="text" name="education_id"  placeholder="education_id"></td>
            </tr>
            <tr>
                <td>Division_id:</td>
                <td><input type="text" name="division_id"  placeholder="division_id"></td>
            </tr>
            <tr>
                <td>User_name:</td>
                <td><input type="text" name="user_name"  placeholder="user_name"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create new Employee"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
