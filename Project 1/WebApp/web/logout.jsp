<%--
  Created by IntelliJ IDEA.
  User: 3
  Date: 3/29/2014
  Time: 15:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    session.removeAttribute("username");
    response.sendRedirect("login.jsp");
%>
</body>
</html>
