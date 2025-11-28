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

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int jumlahPesanan, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * jumlahPesanan;

        if (kodePromo.equals("DISKON50")) {
            int diskon = totalHarga / 2;
            System.out.println("Diskon 50%: Rp" + diskon);
            return totalHarga - diskon;
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = totalHarga * 30 / 100;
            System.out.println("Diskon 30%: Rp" + diskon);
            return totalHarga - diskon;
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
            return totalHarga;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        Menu(); // Tampilkan menu

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.print("\nPesanan ke-" + i + ": Masukkan nomor menu (1–6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / -): ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
        }

        System.out.println("\nTotal keseluruhan pesanan: Rp" + totalKeseluruhan);
    }
}
/*
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return 
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh 
dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
return Digunakan saat kita ingin mengambil hasil dari suatu proses untuk digunakan kembali
contoh : public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    return hargaItems[pilihanMenu - 1] * banyakItem; }
void Digunakan saat fungsi hanya melakukan tindakan langsung, seperti mencetak ke layar, tanpa perlu mengembalikan nilai
contoh :  public static void Menu() {
    System.out.println("=== Menu Kafe ==="); }
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan 
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua 
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing 
parameter dalam konteks program kafe. 
tipe data : int = mengembalikan angka bulat berupa total harga
dua parameter : int pilihanMenu, int jumlahPesanan 
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari 
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga 
totalHarga. 
sudah termodifikasi
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta 
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga 
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis 
menu)?
sudah termodifikasi

*/
