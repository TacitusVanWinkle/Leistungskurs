package blatt11;

public class BubbleSort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {13, -2, 3, 8, 5, 6, 7, 4, 9, 10};
        bubbleSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr);

        blatt07.ArbeitMitArrays.istSortiert(arr);
    }
}