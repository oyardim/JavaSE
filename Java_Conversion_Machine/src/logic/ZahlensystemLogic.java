package logic;

import static model.IO.scan;
import model.Zahlensystem;

public class ZahlensystemLogic {

    Zahlensystem zs = new Zahlensystem();

    public ZahlensystemLogic() {

    }

    public void dezToBin() {

        int i = 1, binary = 0, rest;
        System.out.println("Wert in Dezimalzahl eingeben:");

        int num = scan.nextInt();

        while (num != 0) {

            rest = num % 2;
            binary += i * rest;
            num = num / 2;
            i = i * 10;

        }
        System.out.println("Wert in Binär: " + binary);
    }

    public void binToDez() {
        int letzteziffer, dezimal = 0, i = 0;
        System.out.println("Wert in Binärzahl eingeben:");

        int binary = scan.nextInt();

        while (binary > 0) {

            letzteziffer = binary % 10;
            dezimal += Math.pow(2, i) * letzteziffer;
            binary = binary / 10;
            i++;
        }

        System.out.println("Wert in Dezimalzahl: " + dezimal);
    }

    public void dezToOct() {
        int octal = 0, i = 1, rest;
        System.out.println("Wert in Dezimalzahl eingeben:");

        int dezimal = scan.nextInt();

        while (dezimal > 0) {

            rest = dezimal % 8;
            octal += i * rest;
            dezimal = dezimal / 8;
            i = i * 10;
        }
        System.out.println("Wert in Octal: " + octal);
    }

    public void octToDez() {
        int i = 0, dezimal = 0, ziffer;
        System.out.println("Wert in Octalzahl eingeben:");

        int octal = scan.nextInt();

        while (octal > 0) {

            ziffer = octal % 10;
            dezimal += Math.pow(8, i++) * ziffer;
            octal = octal / 10;

        }
        System.out.println("Wert in Dezimal: " + dezimal);
    }

    public void dezToHex() {
        int hexadezimal = 0, i = 1, rest;
        System.out.println("Wert in Dezimalzahl eingeben:");

        int dezimal = scan.nextInt();

        while (dezimal > 0) {

            rest = dezimal % 16;
            hexadezimal += i * rest;
            dezimal = dezimal / 16;
            i = i * 10;
        }
        System.out.println("Wert in Hexadezimalzahl: " + hexadezimal);
    }

    public void hexToDez() {
        int i = 0, dezimal = 0, ziffer;
        System.out.println("Wert in Hexadezimalzahl eingeben:");

        int hexadezimal = scan.nextInt();

        while (hexadezimal > 0) {

            ziffer = hexadezimal % 10;
            dezimal += Math.pow(16, i++) * ziffer;
            hexadezimal = hexadezimal / 10;

        }
        System.out.println("Wert in Dezimal: " + dezimal);

    }
}
