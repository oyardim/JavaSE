package model;

public class Display {

    //Attribute
    public int[] menuNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] menuTitle = {"Längenmaße", "Gewichte", "Temperatur", "Währung", "Datenmenge", "Zahlensystem", "Beenden"};

//"Von m zu cm", "Von m zu mm", "Von cm zu m", "Von cm zu mm", "Von mm zu m", "Von mm zu cm", "zurück"            
    public int[] subMenuDistNumber = {1, 2, 3, 4, 5, 6, 7,};
    public String[] subMenuDistTitle = {"Von m zu cm", "Von m zu mm", "Von cm zu m", "Von cm zu mm", "Von mm zu m", "Von mm zu cm", "zurück"};

//"Von kg zu g", "Von kg zu mg", "Von g zu kg", "Von g zu mg", "Von mg zu kg", "Von mg zu g", "zurück"            
    public int[] subMenuGewNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuGewTitle = {"Von kg zu g", "Von kg zu mg", "Von g zu kg", "Von g zu mg", "Von mg zu kg", "Von mg zu g", "zurück"};

//"Von °C zu °F", "Von °F zu °C", "zurück"
    public int[] subMenuTempNumber = {1, 2, 3};
    public String[] subMenuTempTitle = {"Von °C zu °F", "Von °F zu °C", "zurück"};

//"Von €uro nach U$D", "Von U$D nach €uro", "zurück"
    public int[] subMenuWährNumber = {1, 2, 3};
    public String[] subMenuWährTitle = {"Von €uro nach U$D", "Von U$D nach €uro", "zurück"};

//"Von kByte zu Byte", "Von kByte zu MByte", "Von Byte zu kByte", "Von Byte zu MByte", "Von MByte zu kByte", "Von MByte zu Byte", "zurück"
    public int[] subMenuDatNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuDatTitle = {"Von kByte zu Byte", "Von kByte zu MByte", "Von Byte zu kByte", "Von Byte zu MByte", "Von MByte zu kByte", "Von MByte zu Byte", "zurück"};

//"Von dez zu bin", "Von bin zu dez", "Von dez zu oct", "Von oct zu dez", "Von dez zu hex", "Von hex zu dez", "zurück"
    public int[] subMenuZahlNumber = {1, 2, 3, 4, 5, 6, 7};
    public String[] subMenuZahlTitle = {"Von dez zu bin", "Von bin zu dez", "Von dez zu oct", "Von oct zu dez", "Von dez zu hex", "Von hex zu dez", "zurück"};

    //Konstruktor
    public Display() {
    }

    //Methoden
    //zeigt das Hauptmenü an
    public void menuShow() {
        for (int i = 0; i < menuNumber.length; i++) {
            System.out.println(menuNumber[i] + ". " + menuTitle[i]);

        }
    }

    //zeigt das Untermenü für Längenmaße
    public void subMenuDistShow() {
        for (int i = 0; i < subMenuDistNumber.length; i++) {
            System.out.println(subMenuDistNumber[i] + ". " + subMenuDistTitle[i]);
        }
    }

    //zeigt das Untermenü für Gewichte
    public void subMenuGewShow() {
        for (int i = 0; i < subMenuGewNumber.length; i++) {
            System.out.println(subMenuGewNumber[i] + ". " + subMenuGewTitle[i]);
        }

    }

    //zeigt das Untermenü für Temperatur
    public void subMenuTempShow() {
        for (int i = 0; i < subMenuTempNumber.length; i++) {
            System.out.println(subMenuTempNumber[i] + ". " + subMenuTempTitle[i]);
        }
    }

    //zeigt das Untermenü für Währung
    public void subMenuWährShow() {
        for (int i = 0; i < subMenuWährNumber.length; i++) {
            System.out.println(subMenuWährNumber[i] + ". " + subMenuWährTitle[i]);
        }
    }

    public void subMenuDatShow() {
        for (int i = 0; i < subMenuDatNumber.length; i++) {
            System.out.println(subMenuDatNumber[i] + ". " + subMenuDatTitle[i]);
        }
    }

    public void subMenuZahlShow() {
        for (int i = 0; i < subMenuZahlNumber.length; i++) {
            System.out.println(subMenuZahlNumber[i] + ". " + subMenuZahlTitle[i]);
        }
    }
}
