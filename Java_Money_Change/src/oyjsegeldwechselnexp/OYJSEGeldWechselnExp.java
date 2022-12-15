package oyjsegeldwechselnexp;

import java.util.Scanner;

public class OYJSEGeldWechselnExp {

    static double preis;
    static double bezahlen;
    static double rückgeld;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wie teuer ist die Ware?");
        preis = input.nextDouble();

        System.out.println("Wie viel Geld möchten Sie geben: ");
        bezahlen = input.nextDouble();

        if (bezahlen > preis) {
            rückgeld = bezahlen - preis;
            System.out.println("Rückgeld: " + rückgeld + " euro ");
            int zweihundert = (int) (rückgeld / 200);

            if (zweihundert > 0) {
                rückgeld = rückgeld % 200;
                System.out.println(zweihundert + "stück 200 Euro ");
            }
            int hundert = (int) (rückgeld / 100);
            if (hundert > 0) {
                rückgeld = rückgeld % 100;
                System.out.println(hundert + " stück 100 Euro");
            }

            int fünfzig = (int) (rückgeld / 50);
            if (fünfzig > 0) {
                rückgeld = rückgeld % 50;
                System.out.println(fünfzig + " stück 50 Euro");
            }

            int zwanzig = (int) (rückgeld / 20);
            if (zwanzig > 0) {
                rückgeld = rückgeld % 20;
                System.out.println(zwanzig + " stück 20 Euro");
            }

            int zehn = (int) (rückgeld / 10);
            if (zehn > 0) {
                rückgeld = rückgeld % 10;
                System.out.println(zehn + " stück 10 Euro");
            }

            int fünf = (int) (rückgeld / 5);
            if (fünf > 0) {
                rückgeld = rückgeld % 5;
                System.out.println(fünf + " stück 5 Euro");
            }

            int zwei = (int) (rückgeld / 2);
            if (zwei > 0) {
                rückgeld = rückgeld % 2;
                System.out.println(zwei + " stück 2 Euro");
            }

            int eins = (int) (rückgeld / 1);
            if (eins > 0) {
                rückgeld = rückgeld % 1;
                System.out.println(eins + " stück 1 Euro");
            }

            int fünfzigcent = (int) (rückgeld / 0.50);
            if (fünfzigcent > 0) {
                rückgeld = rückgeld % 0.50;
                System.out.println(fünfzigcent + " stück 50 Cent");
            }

            int zwanzigcent = (int) (rückgeld / 0.20);
            if (zwanzigcent > 0) {
                rückgeld = rückgeld % 0.20;
                System.out.println(zwanzigcent + " stück 20 Cent");
            }

            int zehncent = (int) (rückgeld / 0.10);
            if (zehncent > 0) {
                rückgeld = rückgeld % 0.10;
                System.out.println(zehncent + " stück 10 Cent");
            }

            int fünfcent = (int) (rückgeld / 0.05);
            if (fünfcent > 0) {
                rückgeld = rückgeld % 0.05;
                System.out.println(fünfcent + " stück 5 Cent");
            }

            int zweicent = (int) (rückgeld / 0.02);
            if (zweicent > 0) {
                rückgeld = rückgeld % 0.02;
                System.out.println(zweicent + " stück 2 Cent");
            }
            int einscent = (int) (rückgeld / 0.01);
            if (einscent > 0) {
                rückgeld = rückgeld % 0.01;
                System.out.println(einscent + " stück 1 Cent");

            }
        } else if (bezahlen < preis) {
            System.out.println("nicht ausreichend");
        } else {
            System.out.println("keine Rückgeld");
        }

    }
}
