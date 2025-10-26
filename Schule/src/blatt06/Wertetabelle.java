package blatt06;
import java.util.Scanner;
public class Wertetabelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welchen Grad soll das Polynom haben?");
        int n = sc.nextInt();
        double[] koeff = new double[n+1];
        for (int i = 0; i < koeff.length; i++) {
            System.out.println("Nenne den Koeffizient " + i + ":");
            koeff[i] = sc.nextDouble();
        }
        System.out.println("Gib die Grenzen der Wertetabelle ein.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        //x-Werte von a bis b in ganzen Schritten
        //b = 9
        //a = 2
        //2 bis inklusive 9 macht 8 Schritte
        //also b-a + 1
        int[] x = new int[(b-a) + 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = a + i; //Befülle alle x-Werte
        }
        //Diese Schleife hat mir gefehlt, oder zumindest hatte ich sie falsch gemacht.
        //Für jeden x-Wert wollen wir den y-Wert bestimmen.
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            double wert = 0; //im Moment
            //Wir setzen den x-Wert in die Funktion ein:
            for (int j = 0; j < koeff.length; j++) {
                wert = wert + (koeff[j] * Math.pow(x[i],j));
            }
            //So, alle Berechnungen sind fertig, also setzen wir den Wert:
            y[i] = wert;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("x = " + x[i] + " => " + "y = " + y[i]);
        }
    }
}