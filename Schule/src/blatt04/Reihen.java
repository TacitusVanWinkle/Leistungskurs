package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Reihen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Wie viele Zahlen möchten sie je Reihe ausgegeben bekommen?");
        int anzahl = input.nextInt();
        int variable = 0;

        System.out.println("Reihe 1:");
        while (variable < anzahl) {
            System.out.print(rand.nextInt(9) + 1 + ", ");
            variable++;
        }
    }
}
