<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>create contract</title>
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
    <input type="hidden" name="action" value="create_contract">
    <fieldset>
        <legend>Contract information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="id"  placeholder="id"></td>
            </tr>
            <tr>
                <td>Start_date:</td>
                <td><input type="date" name="start_date"  placeholder="start_date"></td>
            </tr>
            <tr>
                <td>End-date:</td>
                <td><input type="date" name="end_date"  placeholder="end_date"></td>
            </tr>
            <tr>
                <td>Deposit:</td>
                <td><input type="text" name="deposit"  placeholder="deposit"></td>
            </tr>
            <tr>
                <td>Total_money:</td>
                <td><input type="text" name="total_money"  placeholder="total_money"></td>
            </tr>
            <tr>
                <td>Employee_id:</td>
                <td><input type="text" name="employee_id"  placeholder="employee_id"></td>
            </tr>
            <tr>
                <td>Customer_id:</td>
                <td><input type="text" name="customer_id"  placeholder="customer_id"></td>
            </tr>
            <tr>
                <td>Service_id:</td>
                <td><input type="text" name="service_id"  placeholder="service_id"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create new Contract"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
