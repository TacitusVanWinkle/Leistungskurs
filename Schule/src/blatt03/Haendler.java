package blatt03;

import java.util.Scanner;

public class Haendler {

    public static void main(String[] args) {

        Scanner anzahl = new Scanner(System.in);

        System.out.println("Wie viele Normale SD Karten wollen sie kaufen: ");
        int anzahlNormal = anzahl.nextInt();
        if (anzahlNormal < 0) {
            System.out.println("Negative anzahl nicht möglich");
            System.exit(0);
        }
        if (anzahlNormal > 50) {
            anzahlNormal = 50;
            System.out.println("Maximale Anzahl an SD karten ist 50. Wir haben die Anzahl ihrer SD Karten automatisch auf 50 gesetzt.");
        }

        System.out.println("Wie viele Mini-SD Karten wollen sie kaufen: ");
        int anzahlMini = anzahl.nextInt();
        if (anzahlMini < 0) {
            System.out.println("Negative Anzahl nicht möglich");
            System.exit(0);
        }
        if (anzahlMini > 50) {
            anzahlMini = 50;
            System.out.println("Maximale Anzahl an SD karten ist 50. Wir haben die Anzahl ihrer SD Karten automatisch auf 50 gesetzt.");
        }

        System.out.println("Wie viele Micro-SD Karten wollen sie kaufen: ");
        int anzahlMicro = anzahl.nextInt();
        if (anzahlMicro < 0) {
            System.out.println("Negative Anzahl nicht möglich");
            System.exit(0);
        }
        if (anzahlMicro > 50) {
            anzahlMicro = 50;
            System.out.println("Maximale Anzahl an SD karten ist 50. Wir haben die Anzahl ihrer SD Karten automatisch auf 50 gesetzt.");
        }

        double preisNormal = 5;
        double preisMini = 8;
        double preisMicro = 12;
        double gesamtPreis = (anzahlNormal * preisNormal) + (anzahlMini * preisMini) + (anzahlMicro * preisMicro);

        if (anzahlNormal > 15 || anzahlMini > 15 || anzahlMicro > 15) {
            System.out.println("Sie erhalten 15% Mengenrabatt!");
            gesamtPreis = gesamtPreis * 0.85;
        }

        System.out.println("Der Preis für...\n" + anzahlNormal + " normale SD-karten\n" + anzahlMini + " mini SD-Karten\n" + anzahlMicro + " micro SD-Karten\n");
        System.out.printf("...lautet %.2f €" , gesamtPreis);

        //TODO Letzte sout angabe teilen (unübersichtlich)

    }

}
