package org.example.notes.models;

import java.util.Objects;

public class User {
    private long id;
    private String email;

    private String name;
    private String password;

    private String date;

    private int role;

    public User() {
    }

    public User(long id, String email, String name, String password, String date, int role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.date = date;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() == user.getId()) return false;
        if (getRole() == user.getRole()) return false;
        if ((getEmail() != null) ? !getEmail().equals(user.getEmail()) : getEmail() != null) return false;
        if ((getName() != null) ? !getName().equals(user.getName()) : getName() != null) return false;
        if ((getPassword() != null) ? !getPassword().equals(user.getPassword()) : getPassword() != null) return false;
        return (getDate() != null) ? !getDate().equals(user.getDate()) : getDate() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + getRole();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", date='" + date + '\'' +
                ", role=" + role +
                '}';
    }

}
