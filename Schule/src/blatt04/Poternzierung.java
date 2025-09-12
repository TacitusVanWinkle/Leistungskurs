package blatt04;

import java.util.Scanner;

public class Poternzierung {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Zahl ein, die sie potenzieren wollen.");
        int zahl = input.nextInt();
        System.out.println("Geben Sie den Exponenten ein.");
        int exponent = input.nextInt();

        int ergebnis = 1;
        int variable = 0;
        while (variable < exponent){
            ergebnis = ergebnis * zahl;
            variable ++;
            }
            System.out.println(zahl + "^" + exponent + " = " + ergebnis);
        }
    }
