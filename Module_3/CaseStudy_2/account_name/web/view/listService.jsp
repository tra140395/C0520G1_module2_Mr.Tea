<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Service List</title>
</head>
<body>
<h1 style="color: blueviolet">List of Service</h1>
<table border="1">
    <tr style="color: brown">
        <td>Id</td>
        <td>Name</td>
        <td>Area</td>
        <td>Cost</td>
        <td>Max_people</td>
        <td>Rent_type_id</td>
        <td>Service_type_id</td>
        <td>Standard</td>
        <td>Description</td>
        <td>Pool_area</td>
        <td>Number_of_floors</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${serviceList}" var="service">
        <tr>
            <td>${service.service_id}</td>
            <td>${service.service_name}</td>
            <td>${service.service_area}</td>
            <td>${service.service_cost}</td>
            <td>${service.service_max_people}</td>
            <td>${service.rent_type_id}</td>
            <td>${service.service_type_id}</td>
            <td>${service.standard_room}</td>
            <td>${service.description_other_convenience}</td>
            <td>${service.pool_area}</td>
            <td>${service.number_of_floors}</td>
            <td><a href="/account?action=editService&id=${service.service_id}">Edit</a></td>
            <td><a href="/account?action=deleteService&id=${service.service_id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
