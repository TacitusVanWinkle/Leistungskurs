package blatt04;

import java.util.Random;
import java.util.Scanner;

public class Topfschlagen {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        int topfx = new Random().nextInt(5) + 1;
        int topfy = new Random().nextInt(5) + 1;
        int playerx = 3;
        int playery = 3;
        System.out.println("Du befindest dich auf 3|3 \nDrücke die Tasten W, A, S und D um dich zu bewegen");

        while (true){

            char bewegung = input.next().charAt(0);
            if (bewegung == 'W'){
                playery += 1;
            }

            if (bewegung == 'S'){
                playery -= 1;
            }

            if (bewegung == 'A'){
                playerx -= 1;
            }

            if (bewegung == 'D'){
                playerx += 1;
            }

            System.out.println("Du befindest dich auf: (" + playerx + "|" + playery + ")" );

            if (playerx == topfx && playery == topfy){
                System.out.println("Du hast gewonnen!");
                break;
            }

        }

    }

}
