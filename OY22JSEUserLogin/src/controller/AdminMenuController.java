package controller;
import model.AdminMenu;
import model.IO;
import model.UserLoginModel;

import java.sql.*;

public class AdminMenuController extends AdminMenu {

    public static final String dbname = "userlogin";
    public static final String tableInfo = "userinformation";
    public static final String colID = "id";
    public static final String colVorname = "vorname";
    public static final String colNachname = "nachname";
    public static final String colUsername = "username";
    public static final String colPassword = "password";
    public static final String colisAdmin = "isAdmin";

    String url = "jdbc:mysql://localhost:3306/userlogin";
    String userr = "root";
    String password = "";

    UserLoginModel usm = new UserLoginModel();
    Connection conn = DriverManager.getConnection(url, userr, password);
    Statement statement = conn.createStatement();

    public String mselectInt;
    public String submselectInt;
    boolean wantsBackOrQuit = false;

    public AdminMenuController() throws SQLException {

    }

    public void menu() throws SQLException {
        do {
            menuShow();
            mselectInt = IO.getScan().next();
            switch (mselectInt) {
                case "1":
                    createInfo();
                    wantsBackOrQuit = false;
                    break;
                case "2":
                    readInfo();
                    wantsBackOrQuit = false;
                    break;
                case "3":
                    updateInfo();
                    wantsBackOrQuit = false;
                    break;
                case "4":
                    deleteInfo();
                    wantsBackOrQuit = false;
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Ungültige Eingabe!!!");
                    break;

            }

        } while (!wantsBackOrQuit);
    }

    public void createInfo() throws SQLException {
        System.out.println("Geben Sie id: ");
        usm.setId(IO.getScan().nextInt());
        System.out.println("Vorname: ");
        usm.setVorname(IO.getScan().next());
        System.out.println("Nachname: ");
        usm.setNachname(IO.getScan().next());
        System.out.println("Username: ");
        usm.setUsername(IO.getScan().next());
        System.out.println("Password: ");
        usm.setPassword(IO.getScan().next());
        System.out.println("isAdmin: ");
        usm.setIsAdmin(IO.getScan().next());

        String sql = "INSERT INTO " + tableInfo + " VALUES " + "('" + usm.getId() + "', '" + usm.getVorname() + "', '" + usm.getNachname() + "', '" + usm.getUsername() + "', '" + usm.getPassword() +"', '" + usm.getIsAdmin() + "')";
        statement.execute(sql);
    }

    public void readInfo() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableInfo);
        System.out.println(colID + "          " + colVorname + "        " + colNachname + "                 " + colUsername + "             " + colPassword + "       " + colisAdmin + "               ");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " +
                    resultSet.getString(2) + " " +
                    resultSet.getString(3) + " " +
                    resultSet.getString(4) + " " +
                    resultSet.getString(5) + " " +
                    resultSet.getString(6));
        }
    }
        public void updateInfo() throws SQLException{
            System.out.println("Bitte Auswählen: ");
            do {
                menuShow1();
                submselectInt = IO.getScan().next();
                switch (submselectInt) {
                    case "1":
                        System.err.println("Welche Id möchten Sie aktualisieren: ");
                        usm.setId(IO.getScan().nextInt());
                        System.out.println("Geben Sie neue Id: ");
                        int neuId = IO.getScan().nextInt();
                        String sql = "UPDATE " + tableInfo +  " SET "+ colID + " = '" + neuId + "'" + " WHERE " + colID + " = '" + usm.getId() + "'";
                        statement.execute(sql);
                        break;
                    case "2":
                        System.err.println("Welche Vorname möchten Sie aktualisieren: ");
                        usm.setVorname(IO.getScan().next());
                        System.out.println("Geben Sie neue Vorname: ");
                        String neuVname = IO.getScan().next();
                        String sql1 = "UPDATE " + tableInfo +  " SET "+ colVorname + " = '" + neuVname + "'" + " WHERE " + colVorname + " = '" + usm.getVorname() + "'";
                        statement.execute(sql1);
                        break;
                    case "3":
                        System.err.println("Welche Nachname möchten Sie aktualisieren: ");
                        usm.setNachname(IO.getScan().next());
                        System.out.println("Geben Sie neue Nachname: ");
                        String neuNname = IO.getScan().next();
                        String sql2 = "UPDATE " + tableInfo +  " SET "+ colNachname + " = '" + neuNname + "'" + " WHERE " + colNachname + " = '" + usm.getNachname() + "'";
                        statement.execute(sql2);
                        break;
                    case "4":
                        System.err.println("Welche Username möchten Sie aktualisieren: ");
                        usm.setUsername(IO.getScan().next());
                        System.out.println("Geben Sie neue Username: ");
                        String neuUname = IO.getScan().next();
                        String sql3 = "UPDATE " + tableInfo +  " SET "+ colUsername + " = '" + neuUname + "'" + " WHERE " + colUsername + " = '" + usm.getUsername() + "'";
                        statement.execute(sql3);
                        break;
                    case "5":
                        System.err.println("Welche Password möchten Sie aktualisieren: ");
                        usm.setPassword(IO.getScan().next());
                        System.out.println("Geben Sie neue Password ");
                        String neuPass = IO.getScan().next();
                        String sql4 = "UPDATE " + tableInfo +  " SET "+ colPassword + " = '" + neuPass + "'" + " WHERE " + colPassword + " = '" + usm.getPassword() + "'";
                        statement.execute(sql4);
                        break;
                    case "6":
                        System.err.println("Welche isAdmin möchten Sie aktualisieren: ");
                        usm.setIsAdmin(IO.getScan().next());
                        System.out.println("Geben Sie neue isAdmin ");
                        String neuAdmin = IO.getScan().next();
                        String sql5 = "UPDATE " + tableInfo +  " SET "+ colisAdmin + " = '" + neuAdmin + "'" + " WHERE " + colisAdmin + " = '" + usm.getIsAdmin() + "'";
                        statement.execute(sql5);
                        break;
                    case "7":
                        wantsBackOrQuit = true;
                        break;
                    default:
                        System.err.println("Ungültige Eingabe!!!");
                        break;
                }
            } while (!wantsBackOrQuit);
        }

       public void deleteInfo() throws SQLException {
           System.err.println("Möchten Sie wirklich löschen?: ");
           String antwort = IO.getScan().next();
           if(antwort.equals("ja")){
               System.out.println("Welche ID?: ");
               usm.setId(IO.getScan().nextInt());
           }else{
               System.out.println("Bitte Auswählen: ");
           }
           String sql = "DELETE FROM " + tableInfo + " WHERE " + colID + " = '" + usm.getId() + "'";
           statement.execute(sql);
       }
}