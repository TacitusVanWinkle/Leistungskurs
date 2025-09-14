package blatt04;

import java.util.Scanner;

public class Potenzierung {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Basis ein, die sie potenzieren wollen.");
        int basis = input.nextInt();
        System.out.println("Geben Sie den Exponenten ein.");
        int exponent = input.nextInt();

        double ergebnis = 1;
        int variable = 0;

        if (exponent >= 0) {    //Wenn der Exponent größer oder gleich null ist wird die erste while Schleife ausgeführt.
            while (variable < exponent) {   //Diese wird solange ausgeführt wie variable (0) kleiner als der Exponent ist.
                ergebnis = ergebnis * basis; //Der int ergebnis wird mit sich selbst genommen.
                variable++; //Wenn die Schleife durch ist wird variable 1 zugefügt. Das sorgt für einen Stopp der Schleife nach so vielen Durchgängen wie Zahl des Exponenten.
            }
        } else if (exponent < 0) {  //Wenn der Exponent kleiner als null ist wird die zweite while Schleife durchgeführt.
            while (variable > exponent) {   //Diese wird solange durchgeführt wie variable (0) größer als der Exponent ist.
                ergebnis = ergebnis * basis; //Gleiche Rechnung wie oben.
                variable--; //Wenn die Schleife durch ist wird variable 1 abgezogen. Somit stoppt die Schleife sobald variable gleich Exponent ist.
            }
            ergebnis = 1 / ergebnis;    //Da negative Potenzen für 0,[...] ergebnise sorgen muss 1 durch das Ergebnis der vorherigen Rechnung genommen werden.
        }
        System.out.println(basis + "^" + exponent + " = " + ergebnis);
        }
    }
