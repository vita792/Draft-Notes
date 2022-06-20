package org.example.notes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet", urlPatterns = {"/"})
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();

        try {
            writer.println(PageParts.PAGE_HEADER);
            writer.write("<h1>Hello, Servlet Word!</h1>");
            writer.println("</body>");
            writer.println(PageParts.PAGE_FOOTER);
        } finally {
            writer.close();
        }
    }
}
