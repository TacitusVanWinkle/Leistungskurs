package blatt04;

import java.util.Random;

public class ETF {

    public static void main(String[] args) {
        Random rnd = new Random();

        double sparbetrag = 0;
        double zinssatz = rnd.nextDouble();
        double wert =  3578.89;
        int monat = 0;
        int jahr = 0;

        zinssatz = zinssatz * 0.06;
        zinssatz = zinssatz + 1.06;

        while (jahr < 5){

            while(monat < 12){
                sparbetrag += 50;
                double neuerWert = zinssatz * sparbetrag;
                monat = monat + 1;
                System.out.println("Jahr: " + jahr + ", Monat: " + monat + "," + " Neuer Wert: " + neuerWert);
            }
            monat = 0;
            jahr++;
        }


    }

}
