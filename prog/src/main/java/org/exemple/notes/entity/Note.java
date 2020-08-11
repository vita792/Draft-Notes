package org.exemple.notes.entity;

public class Note {
    private int id;
    private long userId;
    private String text;

    public Note(int id, long userId, String text) {
        this.id = id;
        this.userId = userId;
        this.text = text;
    }
    public Note(String text) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
