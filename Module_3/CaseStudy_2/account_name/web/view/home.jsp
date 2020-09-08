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
    <c:set var="context" value="${pageContext.request.contextPath}" />
    <link rel="stylesheet" type="text/css" href="${context}/view/nhung_vao_home.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
  <div class="container-fluid">
    <div class="row">
      <div class="col-lg-9"><img src="images1.jpg" width="50px"></div>
      <div class="col-lg-3"><a href="#"><h4>Vo Son Tea</h4></a></div>
    </div>
  </div>
      <div id="menu">
          <ul>
              <li>
                  <a href="/account">Home</a>
              </li>

              <li>
                  <a href="#">Employee</a>
                  <ul>
                      <li><a href="/account?action=addNewEmployee">Add new employee</a></li>
                      <li><a href="/account?action=showAllEmployee">Show all employee</a></li>
                  </ul>
              </li>

              <li>
                  <a href="#">Customer</a>
                  <ul>
                      <li><a href="/account?action=addNewCustomer">Add new customer</a></li>
                      <li><a href="/account?action=showAllCustomer">Show all customer</a></li>
                      <li><a href="/account?action=showCustomerUsingService">Show only customer using service</a></li>
                  </ul>
              </li>

              <li>
                  <a href="#">Service</a>
                  <ul>
                      <li><a href="/account?action=addNewService">Add new service</a></li>
                  </ul>
              </li>
              <li>
                  <a href="#">Contract</a>
                  <ul>
                      <li><a href="/account?action=addNewContract">Add new contract</a></li>
                      <li><a href="/account?action=addNewContractDetail">Add new contract detail</a></li>
                  </ul>
              </li>
          </ul>
          <div>
              <form class="form-inline my-2 my-lg-0">
              <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
          </div>
      </div>

</body>
</html>
