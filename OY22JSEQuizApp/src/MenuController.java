public class MenuController {
    Menu m = new Menu();
    Quiz q = new Quiz();

    public String menuSelect;
    public boolean wantsBackOrQuit = false;

    public MenuController() {
    }
    public void mainMenu() {
        do {
            m.showMenu();
            System.out.println("\nBitte Auswählen:");
            menuSelect = IO.getScan().next();
            switch(menuSelect){
                case "1":
                    q.Quizanzeigen();
                    break;
                case "2":
                    Bewertung b = new Bewertung(q.getGesamtzahl(), q.getRichtigezahl(), q.getFalschezahl());
                    b.showBewertung();
                    break;
                case "3":
                    try {
                        Bewertung b1 = new Bewertung(q.getGesamtzahl(), q.getRichtigezahl(), q.getFalschezahl());
                        b1.showStatistic();
                    }
                    catch(Exception e){
                        System.err.println("Lös erstmal die fragen!!!");
                    }
                    break;
                case "4":
                    System.err.println("Leider haben wir kein Admin:((((");
                    break;
                case "5":
                    System.exit(0);
                    wantsBackOrQuit= true;
                    IO.closeIO();
                    break;
                default:
                    System.out.println("Ungültige Eingabe...(1-5)");
                    break;

        }

    }while(!wantsBackOrQuit);
  }
}
