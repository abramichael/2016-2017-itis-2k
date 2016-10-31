<%--
  Created by IntelliJ IDEA.
  User: ma
  Date: 31.10.2016
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entities.Student" %>
<%@ page import="java.util.List" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <% for (Student student: (List<Student> )request.getAttribute("students")) {%>
        <li><%= student.getName() %></li>
  <% } %>
  </body>
</html>
