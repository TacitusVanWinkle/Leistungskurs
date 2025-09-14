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
        int abstandAlt = Math.abs(topfx - playerx) + Math.abs(topfy - playery);
        System.out.println("Du befindest dich auf 3|3 \nDrücke die Tasten W, A, S und D um dich zu bewegen");

        while (true){

            char bewegung = input.next().toUpperCase().charAt(0);
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

            if (playerx < 0){
                System.out.println("Du kannst das 5x5 Grid nicht verlassen!");
                playerx = 0;
            }else if  (playerx > 5){
                System.out.println("Du kannst das 5x5 Grid nicht verlassen!");
                playerx = 5;
            }

            if (playery < 0){
                System.out.println("Du kannst das 5x5 Grid nicht verlassen!");
                playery = 0;
            }else if (playery > 5){
                System.out.println("Du kannst das 5x5 Grid nicht verlassen!");
                playery = 5;
            }

            System.out.println("Du befindest dich auf: (" + playerx + "|" + playery + ")" );

            if (playerx == topfx && playery == topfy){
                System.out.println("Du hast gewonnen!");
                break;
            }
            int abstandNeu = Math.abs(topfx - playerx) + Math.abs(topfy - playery);
            if (abstandAlt > abstandNeu) {
                System.out.println("Wärmer");
            }
            else if (abstandAlt < abstandNeu) {
                System.out.println("Kälter");
            }
            else System.out.println("Lauwarm");
            abstandAlt = abstandNeu;
        }
    }
}
