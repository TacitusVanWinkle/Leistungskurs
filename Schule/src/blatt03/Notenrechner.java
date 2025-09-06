package blatt03;

import java.util.Scanner;

public class Notenrechner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie ihre Punktzahl an:");
        int punktzahl = input.nextInt();

        if (punktzahl > 15) {
            System.out.println("Fehler! Die Punktzahl kann höchstens 15 Punkte sein.");
        }

    }

}
