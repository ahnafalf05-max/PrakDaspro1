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
