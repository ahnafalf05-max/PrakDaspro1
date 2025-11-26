package JOBSHEET12;

public class Kafe1 { 
     public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Kode promo valid: Anda mendapat diskon 50%!");
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Kode promo valid: Anda mendapat diskon 30%!");
    } else {
        System.out.println("Kode promo tidak valid.");
    }

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 22,000");
    System.out.println("2. Cappuccino - Rp 26,000");
    System.out.println("3. Latte - Rp 28,000");
    System.out.println("4. Teh Tarik - Rp 18,000");
    System.out.println("5. Nasi Goreng - Rp 30,000");
    System.out.println("6. Mie Goreng - Rp 25,000");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    Menu("Budi", true, "DISKON30");

}

    }
/*
PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Fungsi tanpa parameter artinya fungsi tersebut tidak menerima input dari luar.
Namun, fungsi tersebut masih bisa mengembalikan nilai dengan tipe data tertentu
misalnya int, float, string
2.Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu 
tanpa menggunakan fungsi!
Ya, daftar menu bisa ditampilkan tanpa fungsi  dengan menuliskan langsung perintah
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
perintah penampilan menu langsung di dalam fungsi main
Keuntungan memakai fungsi Menu() adalah kode lebih rapi, mudah dipanggil ulang, dan gampang diperbarui tanpa menulis ulang semua perintah di main().
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar). 
Program mulai dari main(), lalu memanggil Menu(). Eksekusi masuk ke fungsi Menu(), semua perintah cetak dijalankan, daftar menu tampil di layar, kemudian kembali ke main() dan program selesai.
PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi? 
 Parameter digunakan untuk mengirim data ke dalam fungsi agar fungsi bisa bekerja secara fleksibel sesuai input yang diberikan
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
namaPelanggan dan isMember? 
namaPelanggan = untuk menampilkan sapaan personal seperti
isMember = untuk menentukan apakah pelanggan mendapat diskon atau tidak.
fungsi bisa menyesuaikan output berdasarkan siapa yang memanggil dan status keanggotaannya
3. Apakah parameter sama dengan variabel? Jelaskan
Parameter adalah variabel khusus yang didefinisikan di bagian deklarasi fungsi.
Saat fungsi dipanggil, parameter menerima nilai dari luar
Jadi, parameter adalah variabel input untuk fungsi
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false? 
jika true = program menampilkan pesan diskon 10%
jika false = pesan diskon tidak ditampilkan
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter 
namaPelanggan dan isMember?
akan terjadi error karena fungsi Menu()membutuhkan 2 parameter (string dan boolean) 
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). 
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo 
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang 
berlaku, tampilkan kode invalid. 
sudah termodifikasi
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
perintah pemanggilan fungsi menu yang benar. 
sudah tertulis
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
Jelaskan alasan Anda.
Ya, penggunaan parameter membuat program lebih fleksibel, mudah dibaca, dan mudah dikembangkan.
karena :
1. 	Nilai bisa dikirim dari luar fungsi, tidak perlu ditulis ulang di dalam fungsi.
2. 	Fungsi bisa digunakan untuk banyak pelanggan dengan data berbeda.
*/