package blatt07;

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
    }
}