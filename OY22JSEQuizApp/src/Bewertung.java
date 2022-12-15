public class Bewertung {
    int totalefragen;
    int richtigeantwort;
    int falscheantwort;

    public Bewertung(int totalefragen, int richtigeantwort, int falscheantwort) {
        this.totalefragen = totalefragen;
        this.richtigeantwort = richtigeantwort;
        this.falscheantwort = falscheantwort;
    }

    public void showBewertung() {
        System.out.println("Totalfragen: " + totalefragen);
        System.out.println("Richtige Antort: " + richtigeantwort);
        System.out.println("Falsche Antwort: " + falscheantwort);
    }

    public void showStatistic() {
        double prozent = ((richtigeantwort * 100) / totalefragen);
        System.out.println("Prozent: " + prozent);

    }
}