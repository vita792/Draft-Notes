package org.exemple.notes.controllers;

import org.exemple.notes.dao.UserDaoImpl;
import org.exemple.notes.entity.User;
import org.exemple.notes.repository.UserDao;
import org.exemple.notes.service.IndexTmpl;
import org.exemple.notes.veiws.Errors;
import org.exemple.notes.veiws.IndexHtmlView;
import org.exemple.notes.veiws.PathHtml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "Servlet", urlPatterns = {"/*"})
public class ServletUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        switch (request.getRequestURI()) {


            case "/register":

                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String pass = request.getParameter("pass");
                String repass = request.getParameter("repass");
                if (!pass.equals(repass)) {
                    String pass1 = request.getParameter("pass");
                    String repass1 = request.getParameter("repass");
                    if (!pass1.equals(repass1)) {
                        response.sendRedirect("/register");
                    }
//                    String error = Errors.getInstance().getErrorPassRepass();
//                    PrintWriter printWriter = response.getWriter();
//                    printWriter.println(error);
                } else {
                    User newUser = new User(name, email, pass, repass);
                    UserDao userDao = new UserDaoImpl();
                    try {
                        userDao.saveUser(newUser);
                    } catch (SQLException e) {
                        System.out.println("Error write user");
                    }
                }
                break;
            case "/login":

                break;
        }
    }


        protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            IndexTmpl indexTmpl = new IndexTmpl(out);
            UserDaoImpl userDao = new UserDaoImpl();
//        String header = IndexHtmlView.getInstance().getTopHtml();
//        String footer = IndexHtmlView.getInstance().getBottomHtml();
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write(header);
//        printWriter.write(footer);

            System.out.println(request.getRequestURI());
            switch (request.getRequestURI()) {
                case "/":
                    indexTmpl.showStart();
                    break;
                case "/register":
                    indexTmpl.showRegisterForm();
                    break;
                case "/login":
                    indexTmpl.showLoginForm();
                    break;
                case "/logout":
                    System.out.println("Log out");
                    break;
                case "/note":
                    indexTmpl.createNote();
                    break;
            }
        }

        @Override
        public void init () throws ServletException {
            super.init();
            PathHtml pathHtml = PathHtml.getInstance();
            if (pathHtml.getPath().equals("")) {
                pathHtml.setPath(getServletContext().getRealPath("/html"));
            }
            IndexHtmlView.getInstance();
        }
    }
