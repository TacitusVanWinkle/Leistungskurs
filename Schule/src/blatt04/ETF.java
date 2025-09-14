package blatt04;

import java.util.Scanner;
import java.util.Random;

public class ETF {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        double sparbetrag = 0;
        double wert =  3578.89;
        int monat = 0;
        int jahr = 0;

        System.out.println("Wie viele Jahre willst du berechnen?");
        int jahre = input.nextInt();
        while (jahr < jahre){

            while(monat < 12){
                sparbetrag += 50;
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
