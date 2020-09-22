<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/09/2020
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mail box</title>
    <style>
        .kc {
            float: left;
        }
    </style>
</head>
<body>
<form:form action="/mail" method="post" modelAttribute="mail_box">
<div>
    <div class="kc">Languages</div>
    <div class="kc" style="margin-left: 20px">
        <form:select path="languages" items="${languages}">${mail_box.languages}</form:select>
    </div>
</div>
<br>
<div>
    <div class="kc">Page Size:</div>
    <div class="kc" style="margin-left: 20px;">Show</div>
    <div class="kc" style="margin-left: 10px">
       <form:select path="pageSize" items="${sizeList}">${mail_box.pageSize}</form:select>
    </div>
    <div class="kc" style="margin-left: 10px">emails per page</div>
</div>
    <br>
<div>
    <div class="kc">Spams filter:</div>
    <div class="kc" style="margin-left: 20px">
        <form:checkbox path="spams"></form:checkbox>
    </div>
    <div class="kc" style="margin-left: 10px">Enable spams filter</div>
</div>
    <br>
<div>
    <div class="kc">Signature</div>
    <div class="kc" style="margin-left: 10px"><form:textarea path="signature"></form:textarea></div>
</div>
    <br>
<div class="kc" style="float: left">
    <input type="submit" value="update">
</div>
</form:form>
</body>
</html>
