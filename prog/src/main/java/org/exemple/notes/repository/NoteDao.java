package org.exemple.notes.repository;

import org.exemple.notes.entity.Note;

import java.sql.SQLException;

public interface NoteDao {
    Note createNote(Note note) throws SQLException;
    Note saveNote(Note note) throws SQLException;
    Note deleteNote(Note note) throws SQLException;
    Note findNote(String text) throws SQLException;
    Note findAllNotes(String[] note) throws SQLException;
}
