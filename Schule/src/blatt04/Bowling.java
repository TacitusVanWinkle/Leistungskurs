package blatt04;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Wie viele Pins hast du erwischt?");
            int pins = input.nextInt();
            if (pins < 0 || pins > 10){
                System.out.println("Du kannst höchstens 10 Pins umwerfen und");
            }
        }
    }
}
