package view;

import model.IO;
import model.UserLoginModel;

public class UserLoginview {

    private UserLoginModel user;

    public UserLoginview(UserLoginModel user) {
        this.user = user;
    }
    public void showMessage(String s){
        System.out.println(s);
    }
    public void getUserInfo(){
        try{
            System.out.println("Username: ");
            user.setUsername(IO.getScan().nextLine());
            System.out.println("Password: ");
            user.setPassword(IO.getScan().nextLine());

        }catch(Exception e){
            System.out.println("Eingabe ist Falsch!!!");
        }
    }
}