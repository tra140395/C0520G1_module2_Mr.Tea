<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07/09/2020
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Customer using Contract</title>
</head>
<body>
  <h4><a href="/account">Back to Home</a></h4>
  <h2 style="color: blue">Customer Using Contract</h2>
   <table border="1">
       <tr style="color: brown">
           <td>Customer name</td>
           <td>Attach service name</td>
       </tr>
       <c:forEach var="temp" items="${customerContractList}">
           <tr>
               <td>${temp.customer_name}</td>
               <td>${temp.attach_service_name}</td>
           </tr>
       </c:forEach>

   </table>
   <h4><a href="/account?action=showService">Show Service list</a></h4>
</body>
</html>
