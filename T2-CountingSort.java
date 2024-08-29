import java.util.Arrays;

public class T2-CountingSort {
    public static void countingSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    
    public static void main(String[] args) {
        int[] nilai1 = {5, 4, 1, 3, 2, 6};
        int[] nilai2 = {8, 12, 10, 9, 11, 7};
        int[] nilai3 = {15, 18, 14, 16, 13, 17};
        int[] nilai4 = {20, 23, 21, 24, 22, 19};
        int[] nilai5 = {27, 25, 28, 30, 29, 26};

        System.out.println("Sebelum Counting-Sort:");
        System.out.println(Arrays.toString(nilai1));
        System.out.println(Arrays.toString(nilai2));
        System.out.println(Arrays.toString(nilai3));
        System.out.println(Arrays.toString(nilai4));
        System.out.println(Arrays.toString(nilai5));

        countingSort(nilai1);
        countingSort(nilai2);
        countingSort(nilai3);
        countingSort(nilai4);
        countingSort(nilai5);

        System.out.println("Setelah Counting-Sort:");
        System.out.println(Arrays.toString(nilai1));
        System.out.println(Arrays.toString(nilai2));
        System.out.println(Arrays.toString(nilai3));
        System.out.println(Arrays.toString(nilai4));
        System.out.println(Arrays.toString(nilai5));
    }
}