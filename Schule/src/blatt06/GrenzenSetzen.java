package blatt06;

import java.util.Scanner;

public class GrenzenSetzen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gebe eine Untergrenze ein:");
        int u = input.nextInt();
        if (u < 0) {
            System.out.println("Du kannst keine negativen Zahlen angeben!");
            System.exit(0);
        }
        System.out.println("Gebe eine Obergrenze ein:");
        int o = input.nextInt();
        if (o < u) {
            System.out.println("Die Obergrenze kann nicht kleiner als die Untergrenze sein!");
            System.exit(0);
        }

        int[] array = new int[o + 1];
        for (int i = u; i <= o; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}
