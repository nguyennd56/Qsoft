package controller;

import model.Assets;
import model.UserAssets;
import service.AssetsService;
import service.UserAssetsService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 3 on 3/31/2014.
 */
public class BuyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        String username = String.valueOf(session.getAttribute("username"));
        UserService userService = new UserService();
        int idUser = userService.getId(username); //getid of username store in session


        UserAssetsService userAssetsService = new UserAssetsService();
        UserAssets userAssets = new UserAssets();
        Assets assets = new Assets();

        String assetsName = request.getParameter("name");
        //String assetsPrice = request.getParameter("price");
        String assetsNumber = request.getParameter("number");

        AssetsService assetsService = new AssetsService();
        int idAssets = assetsService.getId(assetsName);

//        if (idAssets!=0){
//            assetsService.addAssets(assetsName,10.1);
//        }


        userAssetsService.addUserAssets(idUser,idAssets, Integer.parseInt(assetsNumber));

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
