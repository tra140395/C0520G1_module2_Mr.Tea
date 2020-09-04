<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/09/2020
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="/css/nhung_vao_home.css">
</head>
<body>
  <div class="col-12 header">
      <div class="col-9"><img src="images1.jpg" width="50px"></div>
      <div class="col-3 right"><a href="#"><h4>Nguyen Van A</h4></a></div>
  </div>
  <div id="menu">
      <ul>
          <li>
              <a href="#">Home</a>
          </li>

          <li>
              <a href="#">Employee</a>
              <ul>
                  <li><a href="#">Add new employee</a></li>
                  <li><a href="#">Show all employee</a></li>
              </ul>
          </li>

          <li>
              <a href="#">Customer</a>
              <ul>
                  <li><a href="#">Add new customer</a></li>
                  <li><a href="#">Show all customer</a></li>
                  <li><a href="#">Show only customer using service</a></li>
              </ul>
          </li>
          <li>
              <a href="#">Service</a>
              <ul>
                  <li><a href="#">Add new service</a></li>
              </ul>
          </li>
          <li>
              <a href="#">Contract</a>
              <ul>
                  <li><a href="#">Add new contract</a></li>
                  <li><a href="#">Add new contract detail</a></li>
              </ul>
          </li>
      </ul>
  </div>
</body>
</html>
