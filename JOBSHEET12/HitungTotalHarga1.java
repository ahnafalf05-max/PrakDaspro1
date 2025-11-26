package JOBSHEET12;

public class HitungTotalHarga1 {
    public static int HitungTotalHarga(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;
}

}
