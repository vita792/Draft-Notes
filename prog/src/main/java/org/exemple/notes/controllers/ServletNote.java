package org.exemple.notes.controllers;

import org.exemple.notes.dao.NoteDaoImpl;
import org.exemple.notes.entity.Note;
import org.exemple.notes.repository.NoteDao;
import org.exemple.notes.service.IndexTmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="note", value="/*/note/*")
public class ServletNote extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
        switch (req.getRequestURI()){
            case"/login/note":
//                String text = req.getParameter("text");
//                Note newNote = new Note(text);
//                NoteDao noteDao = new NoteDaoImpl();
//                try {
//                    noteDao.createNote(newNote);
//                } catch (SQLException e){
//                    e.printStackTrace();
//                }

                IndexTmpl indexTmpl = new IndexTmpl(resp.getWriter());
                indexTmpl.createNote();
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
