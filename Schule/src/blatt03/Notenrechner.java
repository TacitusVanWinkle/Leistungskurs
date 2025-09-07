package blatt03;

import java.util.Scanner;

public class Notenrechner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double eins = 0.85;
        double zwei = 0.70;
        double drei = 0.55;
        double vier = 0.39;
        double fünf = 0.17;
        double sechs = 0;
        //Noten nach prozentzahl im Test

        System.out.println("Wie viele Punkte konnte man erreichen?");
        double maximalpunktzahl = input.nextDouble();
        //Fragt Nutzer nach der Maximalpunktzahl im Test

        System.out.println("Wie viele Punkte hast du erreicht?");
        double persönlichePunktzahl = input.nextDouble();
        //Fragt Nutzer nach seiner Persönlichen Punktzahl im Test

        if ( persönlichePunktzahl > maximalpunktzahl){
            System.out.println("Fehler! Du kannst nicht mehr Punkte die Maximalpunktzahl haben");
            System.exit(0);
        }

        if ( persönlichePunktzahl < 0){
            System.out.println("Fehler! Du kannst nicht weniger Punkte als 0 haben");
            System.exit(0);
        }


        double punktzahl = persönlichePunktzahl / maximalpunktzahl;
        //Berechnet die Punktzahl

        if (punktzahl >= eins){
            System.out.println("Herzlichen Glückwunsch, du hast eine 1!");
            System.exit(0);
        }
        if (punktzahl >= zwei){
            System.out.println("Herzlichen Glückwunsch, du hast eine 2!");
            System.exit(0);
        }
        if (punktzahl >= drei){
            System.out.println("Du hast eine 3!");
            System.exit(0);
        }
        if (punktzahl >= vier){
            System.out.println("Du hast eine 4! Bisschen mehr lernen Brochacho");
            System.exit(0);
        }
        if (punktzahl >= fünf){
            System.out.println("Du hast eine 5! Streng dich mehr an!!!");
            System.exit(0);
        }
        if (punktzahl >= sechs){
            System.out.println("Du hast eine 6! Dödel.");
            System.exit(0);
        }
        //Je nach Punktzahl wird die entsprechende Note ausgegeben. Um zu verhindern, dass trotz 100% auch eine 6 angegeben wird, soll das programm enden nachdem die erste Note ausgegebn wurde.
    }

}