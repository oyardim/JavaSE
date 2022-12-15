public class Fragen {
    String fragen;
    String option1;
    String option2;
    String option3;
    String option4;
    String antwort;

    public Fragen(String fragen, String option1, String option2, String option3, String option4, String antwort) {
        this.fragen = fragen;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.antwort = antwort;
    }
    public String getFragen() {
        return fragen;
    }
    public String getOption1() {
        return option1;
    }
    public String getOption2() {
        return option2;
    }
    public String getOption3() {
        return option3;
    }
    public String getOption4() {
        return option4;
    }
    public String getAntwort() {
        return antwort;
    }
}





