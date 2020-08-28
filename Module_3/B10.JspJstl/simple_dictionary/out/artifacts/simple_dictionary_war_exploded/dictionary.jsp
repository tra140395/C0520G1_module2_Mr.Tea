<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/08/2020
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dictionary</title>
</head>
<body>
<%!
 Map<String,String> dic = new HashMap<>();
%>

<%
    dic.put("hello","xin chao");
    dic.put("how","the nao");
    dic.put("book","quyen vo");
    dic.put("computer","may tinh");

    String word = request.getParameter("word");
    String result = dic.get(word);
    if( result != null){
        out.println("Word: "+word);
        out.println("Result: "+ result);
    } else {
        out.println("Not found!");
    }

%>
<a href="index.jsp">Back to search!</a>

</body>
</html>
