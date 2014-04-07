<%@ page import="com.qsoft.training.ConnectDB" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Login Success Page</title>
</head>
<body>
<%
    String userName = request.getParameter("username");

%>

Ban vua dang nhap voi: <br/>
UserName: <%=userName%>  <br/>
Email: <%=ConnectDB.getEmail(userName)%> <br/>
Number of user logging in to system: <%= request.getSession().getServletContext().getAttribute("loggingUsersCounter") %>
<%--<form action="LogoutServlet" method="post">
    <input type="submit" value="Logout" >
</form>--%>
</body>
</html>