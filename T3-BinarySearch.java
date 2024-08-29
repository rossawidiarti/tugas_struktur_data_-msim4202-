import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] angka, int data, int i, int j) {
        int tengah;

        while (i <= j) {
            tengah = (i + j) / 2;

            if (data == angka[tengah])
            return tengah;

            else if (data < angka[tengah])
            j = tengah -1;

            else
            i = tengah +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] angka = {20, 27, 35, 40, 60};
        int data = 35;

        Arrays.sort(angka);

        System.out.println("Algoritma Searching Menggunakan Binary");

        System.out.print("Angka: ");
        for (int num: angka) {
            System.out.print(num + "  ");
        }
        System.out.println("\nData yang dicari: " + data);
        int hasil = binarySearch(angka, data, 0, angka.length -1);
        if (hasil == -1) {
            System.out.println("\nData tidak ditemukan\n");
        }
        else {
            System.out.println("\nData ada pada indeks ke: " + hasil);
        }
    }
}