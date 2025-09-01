package blatt02;

import java.util.Scanner;

public class Multiplikation {

    public static void main(String[] args) {

        Scanner ziffern = new Scanner(System.in);

        System.out.println("Nenne die erste (ganze) Zahl");
        int ersteZahl = ziffern.nextInt();
        System.out.println("Nenne die zweite (ganze) Zahl");
        int zweiteZahl = ziffern.nextInt();
        System.out.println( ersteZahl + " * " + zweiteZahl + " = " + (ersteZahl * zweiteZahl));

    }

}
