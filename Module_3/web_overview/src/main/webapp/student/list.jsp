<%--
  Created by IntelliJ IDEA.
  User: No Name VN
  Date: 8/27/2020
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--dung code java--%>
<h3>Code java</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
<%
    List<Student> studentList = (List<Student>) request.getAttribute("studentListServlet");
    for (Student student : studentList) {
%>
    <tr>
        <td><%=student.getId()%></td>
        <td><%=student.getName()%></td>
    </tr>
<%
    }
%>
</table>

<%--dung the JSTL--%>
<h3>JSTL</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach var="studenta" items="${studentListServlet}">
        <tr>
            <td><c:out value="${studenta.id}"></c:out></td>
            <td><c:out value="${studenta.name}"></c:out></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
