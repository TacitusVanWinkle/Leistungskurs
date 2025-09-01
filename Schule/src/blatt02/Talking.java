package blatt02;

import java.util.Scanner;

public class Talking {

    public static void main(String[] args) {

        Scanner superScanner = new Scanner(System.in);      //neuer Scanner wird erstell
        System.out.println("Guten Tag, wie heißen Sie?");   //System gibt Frage aus
        String name = superScanner.nextLine();              //Neuer String "name" wird erstellt. Dieser enthält den selbts eingegenen Text
        System.out.println("Hallo " + name + "!");          //Ausgabe sag Hallo (name)! Hier wird der vorher eingegebene String verwendet


    }

}
