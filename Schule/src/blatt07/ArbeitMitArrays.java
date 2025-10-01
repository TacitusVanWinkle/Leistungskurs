package blatt07;

import org.w3c.dom.ls.LSOutput;

public class ArbeitMitArrays {

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(boolean[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print("] \n");
    }

    public static void shiftLeft(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int [i] = int [i + 1];

        }
    }

    public static boolean istSortiert (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] addieren (int[] arr1, int[] arr2) {
        int[] ergebnis;
        if (arr1.length > arr2.length) {
            ergebnis = arr1;
        } else {
            ergebnis = arr2;
        }
        for (int i = 0; i < arr1.length; i++) {
            ergebnis[i] += arr1[i];
        }
        printArray(ergebnis);
        return ergebnis;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        double[] arr1 = {13.5, 12.75, 0.0123456789};
        boolean[] arr2 = {true, true, false, false, true, false, true, false};
        char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
        String[] arr4 = {"Schisch", "Vögele", "Dorn"};
        printArray(arr);
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);

        int[] arr5 = {3, 7, 1, 2, 5, 9, 20};
        System.out.println(istSortiert(arr5));

        int[] arr6 = {1, 2, 9, 10, 6,};
        addieren(arr6, arr5);
    }
}
