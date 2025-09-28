package blatt06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel Fibonacci-Zahlen möchtest du berechnen?");
        int i = input.nextInt();
        int[] arr = new int[i];
        arr[0] = 0;
        arr[1] = 1;

        for (int n = 2; n < i; n++) {
            arr[n] = arr[n - 1] + arr[n - 2];
        }

        System.out.println("Die ersten " + i + " Fibonacci-Zahlen sind:");
        for (int n = 0; n < i; n++) {
            System.out.println(arr[n]);
        }

        System.out.println("Der Quotient der letzten beiden Fibonacci-Zahlen ist :");
        double quotient = (double) arr[i - 1] / arr[i - 2];
        System.out.println(quotient);
        //Aufgabe c) Der quotient ist immer 1,61.... Für F unendlich kommt der exakte Wert des sogenannten "Goldenen Schnitts" raus.
        //           Ich habe die Aufgabe c nicht ganz verstanden. :(
    }
}
