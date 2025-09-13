package blatt04;

import  java.util.Scanner;

public class Rechenuebung {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welche Zahlen möchtest du multiplizieren?");
        int zahl1 = input.nextInt();
        int zahl2 = input.nextInt();

        while(true){
            System.out.println("Was ist die Lösung von " + zahl1 + " * " + zahl2 + "?");
            int ergebnis = input.nextInt();
            if (ergebnis == zahl1 * zahl2){
                break;
            }
        }
        System.out.println("Korrekt!");
    }
}
//Herr Schisch sie machen mir Angst. Die Aufgabe kommt mir so einfach vor.