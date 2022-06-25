package org.example.notes.controllers;

import org.example.notes.dao.UserDao;
import org.example.notes.dao.UserDaoImpl;
import org.example.notes.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"/user/*"})
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        switch (request.getPathInfo()) {
            case "/list-users":
                UserDao userDao = new UserDaoImpl();
                User user = userDao.findByEmail("test1@ukr.net");

                if (user != null) {
                    printWriter.println("<h1>Hello, User %s!</h1>" + user.getName());
                    printWriter.println("<h3>" + user + "</h3>");
                }
                break;
            case "/user":
                break;
        }
    }
}
