package JOBSHEET12;

import java.util.Scanner;

public class Kubus1 {

    
    public static int hitungVolumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    
    public static int hitungLuasPermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }


    public static int[] isianArray(int jumlah) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        return nilai;
    }

    
    public static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    
    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        System.out.println("Volume kubus: " + hitungVolumeKubus(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaanKubus(sisi));

        
        System.out.print("\nMasukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        int[] nilaiMahasiswa = isianArray(N);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}