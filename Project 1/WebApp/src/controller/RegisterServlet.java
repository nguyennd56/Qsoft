package controller;

import model.User;
import service.UserService;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;


/**
 * Created by 3 on 3/29/2014.
 */
public class RegisterServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserService userService = new UserService();
        User user = new User();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String address = request.getParameter("address");
        if (username==null||password==null||repassword==null||address==null){
            out.println("not null field");
        }
        if(!password.equals(repassword)){
            out.println("Password not pair");
        }
        else if (!password.equals(repassword)){
            out.println("Username and Password not validate");
        }
        else if(userService.checkUserExist(username)){
            out.println("User existed");
        }
        else {
            user.setName(username);
            user.setPassword(password);
            user.setAddress(address);
            userService.addUser(user);
            response.sendRedirect("login.jsp");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
