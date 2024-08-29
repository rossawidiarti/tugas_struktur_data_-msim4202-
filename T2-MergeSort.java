import java.util.Arrays;

public class T2-MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, arrIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[arrIndex++] = left[leftIndex++];
            }
            else {
                arr[arrIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            arr[arrIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            arr[arrIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        int[] nilai1 = {5, 4, 1, 3, 2, 6};
        int[] nilai2 = {8, 12, 10, 9, 11, 7};
        int[] nilai3 = {15, 18, 14, 16, 13, 17};
        int[] nilai4 = {20, 23, 21, 24, 22, 19};
        int[] nilai5 = {27, 25, 28, 30, 29, 26};

        System.out.println("Sebelum Merge-Sort:");
        System.out.println(Arrays.toString(nilai1));
        System.out.println(Arrays.toString(nilai2));
        System.out.println(Arrays.toString(nilai3));
        System.out.println(Arrays.toString(nilai4));
        System.out.println(Arrays.toString(nilai5));

        mergeSort(nilai1);
        mergeSort(nilai2);
        mergeSort(nilai3);
        mergeSort(nilai4);
        mergeSort(nilai5);

        System.out.println("Setelah Merge-Sort:");
        System.out.println(Arrays.toString(nilai1));
        System.out.println(Arrays.toString(nilai2));
        System.out.println(Arrays.toString(nilai3));
        System.out.println(Arrays.toString(nilai4));
        System.out.println(Arrays.toString(nilai5));
    }
}