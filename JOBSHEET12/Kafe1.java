package JOBSHEET12;

public class Kafe1 {
    public static void Menu(String namaPelanggan, boolean isMemeber) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if (isMemeber) {
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. kopi hitam - Rp 15,000");
        System.out.println("2. cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh tarik - Rp 12,000");
        System.out.println("5. roti bakar - Rp 10,000");
        System.out.println("6. mie goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("silahkan pilih menu yang anda inginkan.");
    }
public static void main(String[] args) {
    Menu("Andi", true);

    
}
    
}
/* 
percobaan 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
menentukan apakah fungsi menerima input.Jika tidak ada parameter, berarti fungsi tidak butuh data dari luar
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu 
tanpa menggunakan fungsi! 
bisa tanpa Menu()?, sudah
3.Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
perintah penampilan menu langsung di dalam fungsi main
membuat program lebih rapi, fleksibel, dan mudah dikembangkan
4.Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar)
Program dijalankan → JVM masuk ke Main()  → Main() memanggil Menu("Andi",true)  → eksekusi pindah ke fungsi Menu() → tampil sapaan, status member, lalu daftar menu → selesai kembali ke main()  → program berakhir.
percobaan 2
1. Apakah kegunaan parameter di dalam fungsi? 
 Parameter di dalam fungsi berguna sebagai media untuk menerima input dari luar fungsi sehingga fungsi bisa bekerja lebih fleksibel dan dinamis
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
namaPelanggan dan isMember? 
3. Apakah parameter sama dengan variabel? Jelaskan. 
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false? 
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter 
namaPelanggan dan isMember? 
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). 
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo 
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang 
berlaku, tampilkan kode invalid. 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
perintah pemanggilan fungsi menu yang benar. 
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
Jelaskan alasan Anda





*/