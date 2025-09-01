package blatt02;

import java.util.Scanner;

public class Zinssatz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ihr Kapital: ");
        double kapital = input.nextDouble();
        System.out.print("Ihr Zinssatz: ");
        double zinssatz = input.nextDouble();

        double zinsen = kapital * zinssatz / 100;
        double neuesKapital = kapital + zinsen;
        System.out.println("\nAltes Kapital: " + kapital + "€" + "\nZinssatz: " + zinssatz + "€" + "\n\nZinsen: " + zinsen + "€" + "\nNeues Kapital: " + neuesKapital + "€" );

        //TODO Ergebnis auf die zweite Nachkommastelle runden!!!
    }

}
