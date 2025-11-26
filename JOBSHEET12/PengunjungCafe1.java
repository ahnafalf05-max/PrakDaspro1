package JOBSHEET12;

public class PengunjungCafe1 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        System.out.println(); // agar output antar pemanggilan terpisah
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung(); // contoh tanpa argumen
    }
}
/*
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... 
namaPengunjung! 
fitur Java yang memungkinkan sebuah method menerima jumlah argumen yang fleksibel
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
sudah termodifikasi 
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban 
Anda berdasarkan aturan varargs di Java, dan berikan contohnya! 
Tidak bisa. Dalam Java, hanya satu parameter varargs (...) yang diizinkan dalam satu method, dan harus berada di posisi terakhir dalam daftar parameter.
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? 
Jika tetap berjalan, bagaimana output yang dihasilkan? 
Jika fungsi daftarPengunjung dipanggil tanpa argumen, program tidak akan error baik saat kompilasi maupun saat dijalankan
Output yang muncul tetap menampilkan teks pembuka " Daftar nama pengujung: ", tetapi tidak ada daftar nama di bawahnya







*/