package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.web.service.UserService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =  resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Login Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Login page can be accessed via POST method only...<h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String userName = null;
        String password = null;
        String retUrl = "home.html";

        userName = req.getParameter("txtUserName");
        password = req.getParameter("txtPassword");

        UserService userService = new UserService();
        boolean isValidLogin = userService.isValidLogin(userName, password);

        if(!isValidLogin){
            retUrl = "error.html";
        }
        resp.sendRedirect(retUrl);
    }
    
}
