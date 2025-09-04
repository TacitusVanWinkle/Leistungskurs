package blatt03;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Deine erste Zahl ist ");
        int zahlEins = input.nextInt();
        System.out.println("Deine zweite Zahl ist ");
        int zahlZwei = input.nextInt();
        System.out.println("Deine dritte Zahl ist ");
        int zahlDrei = input.nextInt();

        System.out.println();

        if (zahlEins > zahlZwei && zahlEins > zahlDrei) {
            System.out.println(zahlEins + " ist die größte Zahl");
        } else if (zahlEins < zahlZwei && zahlEins < zahlDrei) {
            System.out.println(zahlEins + " ist die kleinste Zahl");
        }

        if (zahlZwei > zahlDrei && zahlZwei > zahlEins) {
            System.out.println(zahlZwei + " ist die größte Zahl");
        } else if (zahlZwei < zahlDrei && zahlZwei < zahlEins) {
            System.out.println(zahlZwei + " ist die kleinste Zahl");
        }

        if (zahlDrei > zahlEins && zahlDrei > zahlZwei) {
            System.out.println(zahlDrei + " ist die größte Zahl");
        } else if (zahlDrei< zahlEins && zahlDrei < zahlZwei) {
            System.out.println(zahlDrei + " ist die kleinste Zahl");
        }

    }

}
