<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
</head>
<body>
<h2>Danh sách khách hàng với JSTL</h2>
<form>
    <table border = "1" width="400">
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach var="customer" items="${customerListServlet}">
            <tr>
                <td><c:out value="${customer.name}"></c:out></td>
                <td><c:out value="${customer.birthday}"></c:out></td>
                <td><c:out value="${customer.address}"></c:out></td>
                <td><img src="${customer.imageUrl}" width="70px" height="70px"/></td>
            </tr>

        </c:forEach>

    </table>
</form>
</body>
</html>
