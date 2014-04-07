<%--
  Created by IntelliJ IDEA.
  User: 3
  Date: 3/29/2014
  Time: 17:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<% HttpSession httpSession = request.getSession();%>
<% System.out.println(httpSession.getAttribute("username"));%>;
</body>
</html>
