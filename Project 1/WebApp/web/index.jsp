<%@ page import="service.UserAssetsService" %>
<%@ page import="service.UserService" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.UserAssets" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="model.Assets" %>
<%@ page import="service.AssetsService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>

    </title>
</head>
<body>

<p><center><h2>Home Page</h2></center></p>
<br>
<center>
<% if (session.getAttribute("username")!=null) {%>
    <p>Welcome:  <%= session.getAttribute("username")%> to QSoft Training Programs </p>

    <%
        String username = String.valueOf(session.getAttribute("username"));
        UserService userService = new UserService();
        int idUser = userService.getId(username); //getid of username store in session

        AssetsService assetsService = new AssetsService();
        UserAssetsService userAssetsService = new UserAssetsService();
        ArrayList<UserAssets> userAssetsArrayList =  userAssetsService.listAssetsToUser(idUser);

        for (Iterator<UserAssets> iter = userAssetsArrayList.iterator();iter.hasNext();){
            UserAssets userAsset = iter.next();
            out.println(assetsService.getName(1));
            out.println(userAsset.getNumber());
            out.println("<br>");
        }

    %>

    <form id="buyform" method="post" action= /BuyServlet>
        Assets Name:
        <select name="name">
        <option value="maytinh">May Tinh</option>
        <option value="chuot">Chuot</option>
        <option value="banphim">Ban Phim</option>
        <option value="camera">Camera</option>
    </select>
        Assets Number: <input type="text" name="number"/>
        <button type="submit">Buy</button>
    </form>


    <a href="logout.jsp">Logout</a><br>

</center>
<%}
    else{ %>
    <center>
    <p>Welcome to QSoft Training Programs </p><br>
    <p>Please Login:</p><a href="login.jsp">Login</a><br>
    <p>Please Register If you don't have Account:<p><a href="register.jsp">Register</a><br>
    </center>


    <%
}
%>
<br>

</body>
</html>