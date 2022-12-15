public class Quiz {
    int gesamtzahl = 0;
    int richtigezahl = 0;
    int falschezahl = 0;

    public Quiz() {
    }
    public int getGesamtzahl() {
        return gesamtzahl;
    }
    public int getRichtigezahl() {
        return richtigezahl;
    }
    public int getFalschezahl() {
        return falschezahl;
    }
    public void Quizanzeigen() {
        Fragen f1 = new Fragen("F1", "A1", "A2", "A3", "A4", "A1");
        Fragen f2 = new Fragen("F2", "B1", "B2", "B3", "B4", "B2");
        Fragen f3 = new Fragen("F3", "C1", "C2", "C3", "C4", "C1");
        Fragen f4 = new Fragen("F4", "D1", "D2", "D3", "D4", "D3");
        Fragen f5 = new Fragen("F5", "E1", "E2", "E3", "E4", "E2");

        Fragen fragenArr[] = {f1, f2, f3, f4, f5};

        for (Fragen f : fragenArr) {

            System.out.println(f.getFragen());
            System.out.println("A. " + f.getOption1());
            System.out.println("B. " + f.getOption2());
            System.out.println("C. " + f.getOption3());
            System.out.println("D. " + f.getOption4());
            System.out.println("Geben Sie eine Antwort: (A-D): ");

            char option = IO.getScan().next().charAt(0);
            String antwort1 = "";

            switch (option) {
                case 'A':
                    antwort1 = f.getOption1();
                    break;
                case 'B':
                    antwort1 = f.getOption2();
                    break;
                case 'C':
                    antwort1 = f.getOption3();
                    break;
                case 'D':
                    antwort1 = f.getOption4();
                    break;
                default:
                    break;
            }
            if (antwort1.equals(f.getAntwort())) {
                richtigezahl++;
            } else {
                falschezahl++;
            }
            gesamtzahl++;
        }
    }
}





























