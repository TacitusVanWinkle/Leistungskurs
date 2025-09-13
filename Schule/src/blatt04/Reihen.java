package blatt04;

import java.util.Scanner;

public class Reihen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Wie viele Zahlen möchten sie je Reihe ausgegeben bekommen?");
        int anzahl = input.nextInt();
        int variable1 = 0;
        int variable2 = 0;
        int variable3 = 0;
        int variable4 = 0;
        int reihe1 = 1;
        int reihe2 = 2;
        int reihe3;
        int reihe4 = 1;

        System.out.println("Reihe 1:");
        while (variable1 < anzahl) {
            System.out.print(reihe1 + ", ");
            variable1++;
            reihe1 ++;
        }
        reihe1 = 1;

        System.out.println("\n\nReihe 2:");
        while (variable2 < anzahl) {
            System.out.print(reihe2 + ", ");
            variable2++;
            reihe2 = reihe2 + 2;
        }
        System.out.println("\n\nReihe 3:");
        while (variable3 < anzahl) {
            reihe3 = reihe1 * reihe1;
            reihe1++;
            System.out.print(reihe3 + ", ");
            variable3++;
        }
        System.out.println("\n\nReihe 4:");
        while (variable4 < anzahl) {
            System.out.print(reihe4 + ", ");
            reihe4 = reihe4 + 1;
            variable4++;
        }
    }
}
