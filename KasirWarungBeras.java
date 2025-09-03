public class KasirWarungBeras {
    public static void main(String[] args) {
        // Data tetap
        double jumlahKg = 10;       // jumlah beras dalam kg
        double hargaPerKg = 12000;  // harga per kg dalam rupiah

        // Hitung total biaya
        double totalBiaya = jumlahKg * hargaPerKg;

        // Hitung diskon 5%
        double diskon = totalBiaya * 0.05;
        double biayaAkhir = totalBiaya - diskon;

        // Uang yang dibayar pembeli
        double uangBayar = 150000; // contoh pembeli bayar Rp 150.000
        double kembalian = uangBayar - biayaAkhir;

        // Cetak struk
        System.out.println("===== STRUK PEMBELIAN WARUNG BERAS =====");
        System.out.println("Jumlah beras  : " + jumlahKg + " kg");
        System.out.println("Harga per kg  : Rp " + hargaPerKg);
        System.out.println("Total biaya   : Rp " + totalBiaya);
        System.out.println("Diskon 5%     : Rp " + diskon);
        System.out.println("Biaya akhir   : Rp " + biayaAkhir);
        System.out.println("Uang bayar    : Rp " + uangBayar);

        if (kembalian < 0) {
            System.out.println(">>> Uang kurang Rp " + Math.abs(kembalian));
        } else {
            System.out.println("Kembalian     : Rp " + kembalian);
        }
    }
}
