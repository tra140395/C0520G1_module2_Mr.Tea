<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06/09/2020
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Employee</title>
</head>
<body>
<h1 style="color: blueviolet">List of Employee</h1>

<table border="1">
    <tr style="color: brown">
        <td>Id</td>
        <td>Name</td>
        <td>Birthday</td>
        <td>Id_card</td>
        <td>Salary</td>
        <td>Phone</td>
        <td>Email</td>
        <td>Address</td>
        <td>Position_id</td>
        <td>Education_id</td>
        <td>Division_id</td>
        <td>User_name</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.employee_id}</td>
            <td>${employee.employee_name}</td>
            <td>${employee.employee_birthday}</td>
            <td>${employee.employee_id_card}</td>
            <td>${employee.employee_salary}</td>
            <td>${employee.employee_phone}</td>
            <td>${employee.employee_email}</td>
            <td>${employee.employee_address}</td>
            <td>${employee.position_id}</td>
            <td>${employee.education_degree_id}</td>
            <td>${employee.division_id}</td>
            <td>${employee.user_name}</td>
            <td><a href="/account?action=editEmployee&id=${employee.employee_id}">Edit</a></td>
            <td><a href="/account?action=deleteEmployee&id=${employee.employee_id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
