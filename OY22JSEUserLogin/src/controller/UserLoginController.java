package controller;
import model.IO;
import model.UserLoginModel;
import view.UserLoginview;
import java.sql.SQLException;

public class UserLoginController extends AdminMenuController{
    private UserLoginModel user1;
    private UserLoginview view;
    AdminMenuController amc = new AdminMenuController();


    public UserLoginController(UserLoginModel user1, UserLoginview view) throws SQLException {
        this.user1 = user1;
        this.view = view;
        while(true){
            view.getUserInfo();
            if(checkLogin()){
                view.showMessage("Sie sind Admin!!!");
                System.out.println("Auswählen: ");
                menu();
                mselectInt = IO.getScan().next();
                break;
            }else{
                view.showMessage("Sie sind nicht Admin!!!");
                break;
            }
        }
    }
    public boolean checkLogin(){
        if(user1.getUsername().equals("o.y@hotmail.com") && user1.getPassword().equals("12345")){
            return true;
        }
        return false;
    }
}

