package blatt04;

import java.util.Scanner;
import java.util.Random;

public class ETF {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        double wert =  3578.89;
        int monat = 0;
        int jahr = 1;

        System.out.println("Wie viele Jahre willst du berechnen?");
        int jahre = input.nextInt();

        if (jahre < 0){
            System.out.println("Du darfst keine negativen Zahlen eingeben!");
            System.exit(0);
        }

        while (true){
            if (jahr > jahre){
                break;
            }

            System.out.println("Wie viel möchtest du dieses Jahr pro Monat investieren?");
            double sparbetrag = input.nextDouble();

            while(monat < 12){
                double zinssatz = rnd.nextDouble();
                zinssatz = zinssatz * 0.06;
                zinssatz = zinssatz + 1.06;
                double neuerWert = zinssatz * sparbetrag;
                monat = monat + 1;
                System.out.printf("Jahr %d,\tMonat %d,\tSparbetrag %.2f€,\tZinssatz %.2f,\tKontostand %.2f€,\t\tMSCI-Anteile %.2f%n", jahr, monat, sparbetrag, (zinssatz-1)*100, neuerWert , wert);
            }
            monat = 0;
            jahr++;
        }

    }

}
