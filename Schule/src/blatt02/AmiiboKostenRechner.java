package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {

    public static void main(String[] args) {

        Scanner preisScanner = new Scanner(System.in);
        System.out.println("Wie viele Amiibos möchten sie Kaufen?");
        int anzahlAmbiibos = preisScanner.nextInt();
        System.out.println("Das macht dann: " + (anzahlAmbiibos * 15) +" €");

        //TODO Warenkorb und Einkaufsbestätigung hinzufügen

    }

}
