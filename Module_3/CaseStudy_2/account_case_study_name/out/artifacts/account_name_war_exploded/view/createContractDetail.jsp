<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Contract Detail</title>
</head>
<body>
<%@ include file="home.jsp"%>
<p></p>
<p></p>
<p>
    <c:if test='${message != null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<form action="/account" method="post">
    <input type="hidden" name="action" value="create_contract_detail">
    <fieldset>
        <legend>Contract information</legend>
        <table>
            <tr>
                <td>Contract_detail_id:</td>
                <td><input type="text" name="contract_detail_id"  placeholder="contract_detail_id"></td>
            </tr>
            <tr>
                <td>Contract_id:</td>
                <td><input type="text" name="contract_id"  placeholder="contract_id"></td>
            </tr>
            <tr>
                <td>Attach_service_id:</td>
                <td><input type="text" name="attach_service_id"  placeholder="attach_service_id"></td>
            </tr>
            <tr>
                <td>Quantity:</td>
                <td><input type="text" name="quantity"  placeholder="quantity"></td>
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
