<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/08/2020
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>List of Customer</title>
  </head>
  <body>

  <h2>Danh sách khách hàng với JSTL</h2>
  <form action="/customer" method="post">
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
    </tr>
    <c:forEach var="customer" items="${customerListServlet}">
     <tr>
       <td><c:out value="${customer.name}"></c:out></td>
       <td><c:out value="${customer.birthday}"></c:out></td>
       <td><c:out value="${customer.address}"></c:out></td>
     </tr>

    </c:forEach>

  </table>
  </form>
  </body>
</html>
