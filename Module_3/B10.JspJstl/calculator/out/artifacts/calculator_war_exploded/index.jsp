<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/08/2020
  Time: 12:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
   <h2>Calculator</h2>
    <form action="/calculate" method="post">
      <table>
       <tr>
           <td>First operand:</td>
           <td><input type="number" name="first_operand"/></td>
       </tr>
       <tr>
           <td>Operator:</td>
           <td>
               <select name="operator">
                   <option value="+">Addition</option>
                   <option value="-">Subtraction</option>
                   <option value="*">Multiplication</option>
                   <option value="/">Division</option>
               </select>
           </td>
       </tr>
       <tr>
           <td>Second operand:</td>
           <td><input type="number" name="second_operand"/></td>
       </tr>
       <tr>
           <td>Enter here:</td>
           <td><input type="submit" id="sumbit" value="calculate"/></td>
       </tr>
      </table>


    </form>
  </body>
</html>
