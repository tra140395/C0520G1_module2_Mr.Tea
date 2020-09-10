<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/09/2020
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form>
    <input type="hidden" name="action" value="login">
     <fieldset>
       <legend><h2>Login</h2></legend>
         <table>
             <tr>
                 <td>User name:</td>
                 <td><input type="text" name="userName" placeholder="user name.."></td>
             </tr>
             <tr>
                 <td>Password:</td>
                 <td><input type="text" name="password" placeholder="password.."></td>
             </tr>
         </table>
     </fieldset>
</form>
</body>
</html>
