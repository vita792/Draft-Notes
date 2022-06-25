package org.example.notes.controllers;

import org.example.notes.views.PathHtmlSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StartServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class StartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html><head><title></title></head><body>");
            out.write("<div class=\"d-grid gap-2 d-md-block\">\n" +
                    "  <button class=\"btn btn-primary btn-outline-primary\" type=\"button\">Button</button>\n" +
                    "  <button class=\"btn btn-primary btn-outline-secondary\" type=\"button\">Button</button>\n" +
                    "</div>");
        } finally {
            out.close();
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();

        PathHtmlSingleton pathHtmlSingleton = PathHtmlSingleton.getInstance();

        if (pathHtmlSingleton.getPath().equals("")) {
            pathHtmlSingleton.setPath(getServletContext().getRealPath("/html/"));
        }

        pathHtmlSingleton.setTop("top.html");
        pathHtmlSingleton.setMenu("menu.html");
        pathHtmlSingleton.setBottom("bottom.html");

    }
}
