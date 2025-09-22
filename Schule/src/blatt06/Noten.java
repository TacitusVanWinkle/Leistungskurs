package blatt06;

import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] noten = new int[10];
        noten[0] = 2;
        noten[1] = 2;
        noten[2] = 3;
        noten[3] = 1;
        noten[4] = 1;
        noten[5] = 4;
        noten[6] = 1;
        noten[7] = 2;
        noten[8] = 3;
        noten[9] = 5;

        for (int a = 0; a < 10; a++) {
            System.out.println("Gebe deine Note " + a + " ein:" );
            noten[a] = input.nextInt();
        }

        for (int i = 0; i <= noten.length - 1; i++) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }
        System.out.println("Notenliste Rückwärts:");
        for (int i = noten.length - 1; i >= 0; i--) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }
    }
}
