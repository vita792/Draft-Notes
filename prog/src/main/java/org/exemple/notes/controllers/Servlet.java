package org.exemple.notes.controllers;

import org.exemple.notes.service.IndexTmpl;
import org.exemple.notes.veiws.IndexHtmlView;
import org.exemple.notes.veiws.PathHtml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        IndexTmpl indexTmpl = new IndexTmpl(out);

        switch (request.getPathInfo()) {
            case "/":

                indexTmpl.showLoginForm();
                break;
            case "/register":
                indexTmpl.showRegisterForm();
                break;
            case "/logout":
                System.out.println("Log out");
                break;


        }

    }

    @Override
    public void init() throws ServletException {
        super.init();
        PathHtml pathHtml = PathHtml.getInstance();
        if (pathHtml.getPath().equals("")) {
            pathHtml.setPath(getServletContext().getRealPath("/html"));
        }
        IndexHtmlView.getInstance();
    }
}
