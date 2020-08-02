package org.exemple.notes.entity;

public class User {
    private long id;
    private String name;
    private String email;
    private String pass;
    private String repass;

    public User(long id, String name, String email, String pass, String repass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.repass = repass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }
}
