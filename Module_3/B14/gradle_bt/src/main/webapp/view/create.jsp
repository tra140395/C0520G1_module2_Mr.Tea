<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/08/2020
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<p>
    <a href="/user">Back to User list</a>
</p>
<p>
    <c:if test='${message != null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<form action="/user" method="post">
    <input type="hidden" name="action" value="create">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Mail:</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><input type="text" name="country" id="country"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create new User"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
