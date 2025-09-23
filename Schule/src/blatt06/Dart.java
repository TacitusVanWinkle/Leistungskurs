package blatt06;

import java.util.Scanner;

public class Dart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe die Anzahl der Spieler an");
        int anzSpieler = scanner.nextInt();
        int[] punkte = new int[anzSpieler];

        for (int i = 0; i < anzSpieler; i++) {
            punkte[i] = 501;
        }
        //Bis hier hin bin ich gekommen!
        while (true) {
            for (int i = 0; i < anzSpieler; i++) {
                int counter_temp = punkte[i];
                int anzahl_wuerfe = 0;

                while (anzahl_wuerfe < 3) {
                    System.out.println("Gebe deine Punktzahl ein (0-60)");
                    int wurf = scanner.nextInt();
                    counter_temp = counter_temp - wurf;
                    if (counter_temp == 0){
                        System.out.println("0 Punkte! Du hast gewonnen.");
                        break outer;
                    }
                    else if (counter_temp < 0) {
                        System.out.println("Überworfen! Du hast noch " + counter_punkte + " Punkte Rest.");
                        break;
                    }
                    if (anzahl_wuerfe == 2) {
                        counter_punkte = counter_temp;
                    }
                    System.out.println("Die aktuelle Punktzahl ist: " + counter_temp);
                    anzahl_wuerfe++;
                }
            }

            System.out.println("Runde beendet.");
        }
    }
}
