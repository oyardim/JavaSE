package model;

public class AdminMenu {
    private Integer[] menuNumber = {1, 2, 3, 4, 5};
    private String[] menuTitle = {"Create Info", "Read Info", "Update Info", "Delete Info", "Exit"};

    private Integer[] submenuNumber = {1,2,3,4,5,6,7};
    private String[] submenuTitle = {"id", "vorname", "nachname", "username", "password", "isAdmin","Exit"};

    public AdminMenu() {
    }

    public void menuShow(){
        for (int i = 0; i < menuNumber.length; i++) {
            System.out.println(menuNumber[i] + ". " + menuTitle[i]);
        }
    }

    public void menuShow1(){
        for(int i = 0; i < submenuNumber.length; i++){
            System.out.println(submenuNumber[i] + ". " + submenuTitle[i]);
        }
    }
}