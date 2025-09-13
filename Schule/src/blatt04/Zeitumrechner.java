package blatt04;

import java.util.Scanner;

public class Zeitumrechner {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Geben sie eine positive Zahl an Sekunden ein:");
        int sekunden = input.nextInt();
        int minuten = 0;
        int stunden = 0;
        int tage = 0;
        int zählvariable = 0;

        while (sekunden >= 60){
            sekunden -= 60;
            minuten++;
            zählvariable++;
        }
        while (minuten >= 60){
            minuten -= 60;
            stunden++;
            zählvariable++;
        }
        while (stunden >= 24){
            stunden -= 24;
            tage++;
            zählvariable++;
        }

        System.out.println(tage + " Tage, " + stunden + " Stunden, " +  minuten + " Minuten, " + sekunden + " Sekunden");
        System.out.println("Das Programm hat " + zählvariable + " Schleifendurchgänge gebraucht.");
        //Aufgabe b) Das Programm braucht für 8943103 Sekunden 151638 Schleifendurchgänge!
        //Aufgabe c) Möglicherweise wäre das möglich, wenn man die Rechenwege selbst aufschreibt anstadt sie in Schleifen zu verschachteln.
    }
}
