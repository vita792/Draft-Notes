package org.example.notes.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NoteServlet", urlPatterns = {"/note/*"})
public class NoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        writer.println(PageParts.PAGE_HEADER);
//        writer.println(PageParts.getTag("h3", "Form had sanded", "class=\"text-info\""));
//        String memo = new String(request.getParameter("textInputMemo").getBytes("ISO-8859-1"), "UTF-8");
//        String[] memoList = memo.split("\\n");
//        for (String line : memoList) {
//            writer.println(PageParts.getTag("h4", "Text: \t" + line, ""));
//        }
//        writer.println(PageParts.PAGE_FOOTER);
//
//        HttpSession session = request.getSession();
//        session.setAttribute("memo", memoList);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        switch (request.getPathInfo()) {
            case "/list-notes":
                writer.write("<h1>List Secret Notes!</h1>");
                writer.write("<div class=\"d-grid gap-2 d-md-block\">\n" +
                        "  <button class=\"btn btn-primary btn-outline-primary\" type=\"button\">Button</button>\n" +
                        "  <button class=\"btn btn-primary btn-outline-secondary\" type=\"button\">Button</button>\n" +
                        "</div>");
                break;
            case "/view-note":
                writer.write("<h1>Secret Note!</h1>");
                writer.write("<div class=\"d-grid gap-2 d-md-block\">\n" +
                        "  <button class=\"btn btn-primary btn-outline-primary\" type=\"button\">Button</button>\n" +
                        "  <button class=\"btn btn-primary btn-outline-secondary\" type=\"button\">Button</button>\n" +
                        "</div>");
                break;
            case "/create-note":
                writer.write("<h1>Create Secret Note!</h1>");
                writer.write("<div class=\"d-grid gap-2 d-md-block\">\n" +
                        "  <button class=\"btn btn-primary btn-outline-primary\" type=\"button\">Button</button>\n" +
                        "  <button class=\"btn btn-primary btn-outline-secondary\" type=\"button\">Button</button>\n" +
                        "</div>");
                break;
        }
        writer.close();
    }
//    private String showInfo(HttpServletRequest request) {
//        return PageParts.getTag("h1", "Info about SERVLET", "") +
//                PageParts.getTag("h2", "Info about SERVLET", "") + "\n" +
//                PageParts.getTag("h3", "getContextPath: \t" + request.getContextPath(), "") + "\n" +
//                PageParts.getTag("h3", "getServletPath: \t" + request.getServletPath(), "") + "\n" +
//                PageParts.getTag("h3", "getPathInfo: \t" + request.getPathInfo(), "") + "\n";
//    }
//
//    private String addNoteForm() {
//        String row = """
//                <div class="form=group">
//                <label for="textInputMemo">Enter some Text</label>
//                <textarea class="form-control" id="textInputMemo" name="textInputMemo" rows="50"></textarea>
//                </div>
//                """;
//        String submit = """
//                <div class="form=group">
//                <button type="submit" class="btn btn-default btn-block">SEND</button>
//                </div>
//                """;
//        String[][] tag = {
//                {row, "col-xs-12 col-sm-6 col-md-offset-3 col-ld-4 col-ld-offset-4"},
//                {submit, "col-xs-6 col-xs-offset-6 col-md-3 col-md-offset-6 col-ld-2 col-ld-offset-6"},
//        };
//        return "form method=\"POST\">n" + PageParts.getColumns(tag) + "\t\t</form>";
//    }
//
//    private String showNote(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        String[] memoList = (String[]) session.getAttribute("memo");
//        StringBuilder note = new StringBuilder();
//        if (memoList != null) {
//            for (String row : memoList) {
//                note.append(PageParts.getTag("p", row, ""));
//            }
//        }
//        return note.toString();
//    }
}

