package JOBSHEET12;
public class Kafe1 { 
    public static void Menu() { 
        
        
        System.out.println("==== MENU RESTO KAFE ===="); 
        System.out.println("1. Kopi Hitam - Rp 15,000"); 
        System.out.println("2. Cappuccino - Rp 20,000"); 
        System.out.println("3. Latte - Rp 22,000"); 
        System.out.println("4. Teh Tarik - Rp 12,000"); 
        System.out.println("5. Roti Bakar - Rp 10,000"); 
        System.out.println("6. Mie Goreng - Rp 18,000"); 
        System.out.println("Silakan pilih menu yang Anda inginkan."); } 
        public static void main(String[] args) { 
            Menu(); }
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


*/