package logic;

import model.Display;
import model.IO;

public class DisplayLogic {

    //Attribute
    public String menuSelect;
    public String subMenuSelect;
    public boolean wantsBackOrQuit = false;
    Display dp = new Display();

    //Konstruktor
    public DisplayLogic() {

    }

    //Methoden
    public void mainMenu() {
        do {
            dp.menuShow();
            System.out.println("\nBitte auswählen:");
            menuSelect = IO.getsScan().next();
            switch (menuSelect) {
                //Längenmaße
                case "1":
                    subMenuDist();
                    wantsBackOrQuit = false;
                    break;
                //Gewicht
                case "2":
                    subMenuGew();
                    wantsBackOrQuit = false;
                    break;
                //Temperatur    
                case "3":
                    subMenuTemp();
                    wantsBackOrQuit = false;
                    break;
                //Währung    
                case "4":
                    subMenuWähr();
                    wantsBackOrQuit = false;
                    break;
                //DatenMenge    
                case "5":
                    subMenuDat();
                    wantsBackOrQuit = false;
                    break;
                //Zahlensystem    
                case "6":
                    subMenuZahl();
                    wantsBackOrQuit = false;
                    break;
                //Beenden    
                case "7":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Längenmaße
    public void subMenuDist() {
        do {
            dp.subMenuDistShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode m -> cm
                case "1":
                    new MetricLaengeLogic().mToCm();
                    break;
                //Aufruf der Methode m -> mm
                case "2":
                    new MetricLaengeLogic().mToMM();
                    break;
                //Aufruf der Methode cm -> m  
                case "3":
                    new MetricLaengeLogic().cmToM();
                    break;
                //Aufruf der Methode cm -> mm    
                case "4":
                    new MetricLaengeLogic().cmToMm();
                    break;
                //Aufruf der Methode mm -> m    
                case "5":
                    new MetricLaengeLogic().mmToM();
                    break;
                //Aufruf der Methode mm -> cm
                case "6":
                    new MetricLaengeLogic().mmToCm();
                    break;
                //zurück    
                case "7":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }

    //Untermenü Gewicht
    public void subMenuGew() {
        do {
            dp.subMenuGewShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode Von kg zu g
                case "1":
                    new MetricGewichtLogic().kgToG();
                    break;
                //Aufruf der Methode Von kg zu mg
                case "2":
                    new MetricGewichtLogic().kgToMg();
                    break;
                //Aufruf der Methode Von g zu kg   
                case "3":
                    new MetricGewichtLogic().gToKg();
                    break;
                //Aufruf der Methode Von g zu mg  
                case "4":
                    new MetricGewichtLogic().gToMg();
                    break;
                //Aufruf der Methode Von mg zu kg    
                case "5":
                    new MetricGewichtLogic().mgToKg();
                    break;
                //Aufruf der Methode Von mg zu g    
                case "6":
                    new MetricGewichtLogic().mgToG();
                    break;
                //zurück    
                case "7":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);

    }
    //Untermenü Temperatur
    public void subMenuTemp() {
        do {
            dp.subMenuTempShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode Von °C zu °F
                case "1":
                    new TemperaturLogic().cToF();
                    break;
                //Aufruf der Methode Von °F zu °C
                case "2":
                    new TemperaturLogic().fToC();
                    break;
                //zurück  
                case "3":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }
    //Untermenü Währung
    public void subMenuWähr() {
        do {
            dp.subMenuWährShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode Von €uro nach U$D
                case "1":
                    new WaerungLogic().euroToUsd();
                    break;
                //Aufruf der Methode Von U$D nach €uro
                case "2":
                    new WaerungLogic().usdToEuro();
                    break;
                //zurück  
                case "3":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }
    //Untermenü DatenMenge   
    public void subMenuDat() {
        do {
            dp.subMenuDatShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode Von kByte zu Byte
                case "1":
                    new DatenMengeLogic().kByteToByte();
                    break;
                //Aufruf der Methode Von kByte zu MByte
                case "2":
                    new DatenMengeLogic().kByteToMByte();
                    break;
                //Aufruf der Methode Von Byte zu kByte  
                case "3":
                    new DatenMengeLogic().byteToKByte();
                    break;
                //Aufruf der Methode Von Byte zu MByte   
                case "4":
                    new DatenMengeLogic().byteToMByte();
                    break;
                //Aufruf der Methode Von MByte zu kByte    
                case "5":
                    new DatenMengeLogic().mByteToKByte();
                    break;
                //Aufruf der Methode Von MByte zu Byte  
                case "6":
                    new DatenMengeLogic().mByteToByte();
                    break;    
                //zurück  
                case "7":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }
    //Untermenu Zahlensystem
      public void subMenuZahl() {
        do {
            dp.subMenuZahlShow();
            System.out.println("\nBitte auswählen:");
            subMenuSelect = IO.getsScan().next();
            switch (subMenuSelect) {
                //Aufruf der Methode Von dez zu bin                                  
                case "1":
                    new ZahlensystemLogic().dezToBin();
                    break;
                //Aufruf der Methode Von bin zu dez
                case "2":
                    new ZahlensystemLogic().binToDez();
                    break;
                //Aufruf der Methode Von dez zu oct   
                case "3":
                    new ZahlensystemLogic().dezToOct();
                    break;
                //Aufruf der Methode Von oct zu dez  
                case "4":
                    new ZahlensystemLogic().octToDez();
                    break;
                //Aufruf der Methode Von dez zu hex     
                case "5":
                    new ZahlensystemLogic().dezToHex();
                    break;
                //Aufruf der Methode Von hex zu dez
                case "6":
                    new ZahlensystemLogic().hexToDez();
                    break;    
                //zurück  
                case "7":
                    wantsBackOrQuit = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;

            }
        } while (!wantsBackOrQuit);
    }
}                                                                                                                    



                                                                                              