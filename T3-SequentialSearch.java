public class SequentialSearch {
    public static int sequentialSearch(int[] angka, int data) {
        for (int i = 0; i < angka.length; i++) {
            if (data == angka[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] angka = {30, 15, 20, 44, 7};
        int data = 15;

        System.out.println("Algoritma Searching Menggunakan Sequential");

        System.out.print("Angka: ");
        for (int num: angka) {
            System.out.print(num + "  ");
        }
        System.out.println("\nData yang dicari: " + data);
        int hasil = sequentialSearch(angka, data);
        if (hasil == -1) {
            System.out.println("\nData tidak ditemukan\n");
        }
        else {
            System.out.println("\nData ada pada indeks ke: " + hasil);
        }
    }
}