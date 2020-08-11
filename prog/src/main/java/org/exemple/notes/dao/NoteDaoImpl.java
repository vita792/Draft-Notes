package org.exemple.notes.dao;

import org.exemple.notes.entity.Note;
import org.exemple.notes.entity.User;
import org.exemple.notes.repository.NoteDao;
import org.exemple.notes.repository.UserDao;
import org.exemple.notes.service.IndexTmpl;
import org.exemple.notes.veiws.IndexHtmlView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NoteDaoImpl implements NoteDao {

    @Override
    public Note createNote(Note note) throws SQLException {
        DataSource dataSource = new DataSource();
        Connection connection = dataSource.createConnection();
        if (note == null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(
                        """
                            INSERT INTO note (DESCRIPT) VALUES (?)
                            """);
                preparedStatement.setString(1, note.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return note;
        }

    @Override
    public Note saveNote(Note note) throws SQLException {
        DataSource dataSource = new DataSource();
        Connection connection = dataSource.createConnection();
        if ( note == null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(
                        """
                            INSERT INTO note (DESCRIPT) VALUES (?)
                            """);
            preparedStatement.setString(1, note.getText());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        return note;
    }

    @Override
    public Note deleteNote(Note note) throws SQLException {
        return null;
    }


    @Override
    public Note findNote(String text) throws SQLException {
        return null;
    }

    @Override
    public Note findAllNotes(String[] note) throws SQLException {
        return null;
    }
}
