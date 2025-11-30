package JOBSHEET12;

import java.util.Scanner;

public class HitungBalok1 {

    
    static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }

    
    static int hitungVolume(int tinggi, int pjg, int lb) {
        return hitungLuas(pjg, lb) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t;

        System.out.println("Masukkan panjang: ");
        p = input.nextInt();

        System.out.println("Masukkan lebar: ");
        l = input.nextInt();

        System.out.println("Masukkan tinggi: ");
        t = input.nextInt();

        
        int L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        
        int vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }
}

/*
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program 
dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
1. Program dijalankan, eksekusi dimulai dari method main.
2. Objek Scanner dibuat untuk menerima input dari pengguna.
3. Program menampilkan pesan “masukkan panjang” lalu menunggu input angka panjang.
4. Program menampilkan pesan “masukkan lebar” lalu menunggu input angka lebar.
5. Program menampilkan pesan “masukkan tinggi” lalu menunggu input angka tinggi.
6. Program menghitung luas persegi panjang dengan rumus L = p * l.
7. Program menampilkan hasil perhitungan luas ke layar.
8. Program menghitung volume balok dengan rumus vol = p * l * t.
9. Program menampilkan hasil perhitungan volume ke layar.
10.Program menutup objek Scanner dan eksekusi selesai

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna 
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur 
jalannya program sampai output tersebut muncul. 
masukkkan panjang 
4
masukkan lebar
3
masukkan tinggi
5
Luas persegi panjang adalah 12
Volume balok adalah 60
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program 
tersebut!
output : 1234567
- Program dimulai dari method main.
- Di dalam main, method Jumlah(1, 1) dipanggil hasilnya adalah 2, disimpan dalam variabel temp.
- Kemudian TampilJumlah(temp, 5) dipanggil TampilJumlah(2, 5).
- Di dalam TampilJumlah, method Jumlah(2, 5) dipanggil hasilnya adalah 7.
- Lalu TampilHinggaKe(7) dipanggil mencetak angka dari 1 sampai 7 tanpa spasi.
- Hasil akhir yang ditampilkan ke layar adalah: 1234567
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? 
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? 
Jelaskan! 
Fungsi menggunakan parameter:
- Jika fungsi membutuhkan data dari luar untuk diproses.
- Contoh: menghitung luas, volume, atau operasi matematika yang bergantung pada input pengguna
 Jika fungsi tidak membutuhkan data dari luar, misalnya:
- Menampilkan pesan tetap.
- Mengakses data yang sudah tersedia secara global atau tetap.
Fungsi memiliki nilai kembalian:
- Jika hasil dari fungsi akan digunakan kembali di tempat lain (misalnya disimpan, ditampilkan, atau diproses lebih lanjut).
- Cocok untuk fungsi perhitungan atau pengambilan data.
Fungsi tanpa nilai kembalian:
- Jika fungsi hanya melakukan aksi langsung, seperti mencetak ke layar
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi 
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume 
di Percobaan 5. 
fungsi hitungLuas dan hitungVolume, parameter digunakan karena nilai panjang, lebar, dan tinggi diperoleh dari input pengguna dan bisa berbeda setiap kali program dijalankan
Sebaliknya, fungsi boleh tidak menggunakan parameter jika data yang dibutuhkan sudah tersedia secara tetap di dalam fungsi atau berasal dari variabel global yang tidak berubah
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan 
kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, 
hitungLuas, dan hitungVolume.
Fungsi sebaiknya memiliki nilai kembalian jika hasil dari proses di dalam fungsi perlu digunakan kembali, baik untuk ditampilkan, disimpan, atau diproses lebih lanjut. Fungsi hitungLuas dan hitungVolume memiliki nilai kembalian karena hasil perhitungannya digunakan di luar fungsi, yaitu untuk ditampilkan ke layar
Sebaliknya, fungsi tidak perlu memiliki nilai kembalian jika tujuannya hanya untuk menjalankan aksi langsung, seperti mencetak output ke layar atau menjalankan urutan











*/