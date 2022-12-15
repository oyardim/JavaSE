public class Menu {
    public Integer[] menuNumber = {1,2,3,4,5};
    public String[] menuItem = {"Quiz Anzeigen","Bewertung","Statistic","Admin","Exit"};

    public Menu() {
    }
    public void showMenu(){
        for(int i = 0; i <menuNumber.length; i++){
            System.out.println(menuNumber[i] + ". " + menuItem[i]);
        }
    }
}
