package blatt02;

import java.util.Scanner;

public class Haendler {

    public static void main(String[] args) {

        Scanner anzahl = new Scanner(System.in);

        System.out.println("Wie viele Normale SD Karten wollen sie kaufen: ");
        int anzahlNormal = anzahl.nextInt();

        System.out.println("Wie viele Mini-SD Karten wollen sie kaufen: ");
        int anzahlMini = anzahl.nextInt();

        System.out.println("Wie viele Micro-SD Karten wollen sie kaufen: ");
        int anzahlMicro = anzahl.nextInt();

        double preisNormal = 5;
        double preisMini = 8;
        double preisMicro = 12;

        System.out.println("Der Preis für...\n" + anzahlNormal + " normale SD-karten\n" + anzahlMini + " mini SD-Karten\n" + anzahlMicro + " micro SD-Karten\n" + "...lautet " + (anzahlMini * preisMini + anzahlNormal * preisNormal + anzahlMicro * preisMicro) + " €");

        //TODO Letzte sout angabe teilen (unübersichtlich)
    }

}
