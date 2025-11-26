package JOBSHEET12;

import java.util.Scanner;

public class HitungTotalHarga1 {

    public static void Menu() {
        System.out.println("=== Menu Kafe ===");
        System.out.println("1. Nasi Goreng     - Rp15.000");
        System.out.println("2. Ayam Bakar      - Rp20.000");
        System.out.println("3. Mie Goreng      - Rp22.000");
        System.out.println("4. Es Teh          - Rp12.000");
        System.out.println("5. Air Mineral     - Rp10.000");
        System.out.println("6. Jus Buah        - Rp18.000");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}