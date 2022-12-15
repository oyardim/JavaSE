package oyjseschulzeugnisapp;

import java.util.Scanner;

public class OYJSESchoolZPlus {

    //Attritube
    static Scanner input = new Scanner(System.in);
    static double de;
    static double en;
    static double ma;
    static double in;
    static double sp;
    static double avg = (de + en + ma + in + sp) / 5;
    static String alert = "keine Note vorhanden";
    static int wahl;

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        do {
            System.out.println("Bitte auswählen:\n1. Zeugnis anzeigen\n2. Note Eingabe\n3. Durchschnittsnote\n4. Beenden");
            wahl = input.nextInt();
            switch (wahl) {
                case 1:
                    noteShow();
                    break;
                case 2:
                    noteInput();
                    break;
                case 3:
                    noteavg();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Falsche Eingabe(1-4)");
                    break;
            }
        } while (wahl != 4);

    }

    public static void noteShow() {
        if (de >= 1 && de <= 6) {
            System.out.println("Deutsch: " + de);
        } else {
            System.out.println("Deutsch: " + alert);
        }
        if (en >= 1 && en <= 6) {
            System.out.println("Englisch: " + en);
        } else {
            System.out.println("Englisch: " + alert);
        if (ma >= 1 && ma <= 6){ 
            System.out.println("Mathematik: " + ma);
        } else {
            System.out.println("Mathematik: " + alert);
        if (in >= 1 && in <= 6) {
            System.out.println("Informatik: " + in);
        }else {
            System.out.println("Informatik: " + alert);
        if (sp >= 1 && sp <= 6 ) {
            System.out.println("Sport: " + sp);
        }else {
            System.out.println("Sport: " + alert);
        } 
        }
        } 

        }
    }

    public static void noteInput() {
        System.out.println("Deutsch: ");
        de = input.nextDouble();
        if (de >= 1 && de <= 6) {
            System.out.println("Englisch: ");
            en = input.nextDouble();
            if(en >= 1 && en <= 6){
                System.out.println("Mathematik: ");
                ma = input.nextDouble();
                if(ma >= 1 && ma <= 6){ 
                    System.out.println("Informatik: ");
                    in = input.nextDouble();
                    if(in >= 1 && in <= 6){ 
                        System.out.println("Sport: ");
                        sp = input.nextDouble();
                        if(sp >= 1 && sp <= 6){
                        }else{
                            System.out.println("Falsch...Note (1-6)");
                        }
                    }else{
                        System.out.println("Falsch...Note (1-6)");
                    }
                        
                }else{
                    System.out.println("Falsch...Note (1-6)");
                }
                
            }else{
                System.out.println("Falsch...Note (1-6)");
                
            }
        } else {
            System.out.println("Falsch...Note (1-6)");
        }

    }

    public static void noteavg() {
        double avg = (de + en + ma + in + sp) / 5;
        System.out.println("Durschschnitsnote ist: " + avg);

    }

    public static void exit() {
        System.exit(0);

    }
}
