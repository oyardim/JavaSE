package model;

public class UserLoginModel {
    private int id;
    private String vorname;
    private String nachname;
    private String username;
    private String password;
    private String isAdmin;

    public UserLoginModel() {
    }

    public UserLoginModel(String vorname, String nachname, String username, String password, String isAdmin) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
