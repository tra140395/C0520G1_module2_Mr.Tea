<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/08/2020
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>simple dictionary</title>
  </head>
  <body>
   <h1>Vietnamese dictionary</h1>
   <form action="dictionary.jsp" method="post">
  <table>
    <tr>
      <td><input type="text" name="word" placeholder="Enter word: "/></td>
      <td><input type="submit" id="submit" value="search"/></td>
    </tr>
  </table>
   </form>
  </body>
</html>
