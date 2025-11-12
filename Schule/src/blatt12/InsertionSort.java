package blatt12;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int[] arrSort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("Element = " + arr[i]);
            int element = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < element) {
                    count++;
                }
            }
            arrSort[count] = element;
            //System.out.println("Auf Position " + count);
        }

        return arrSort;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 14, 2, 36, -47, 5, 67, -67, 78, 9, -10 };
        arr = insertionSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr);

    }
}
