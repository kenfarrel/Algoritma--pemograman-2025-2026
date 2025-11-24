import java.util.Scanner;

public class StrukPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double harga, total, diskon, total_bayar;
        int jumlah;

        // Input
        System.out.print("Masukkan nama barang: ");
        nama = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        harga = input.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        jumlah = input.nextInt();

        // Perhitungan
        total = harga * jumlah;

        if (total > 30000) {
            diskon = total * 0.10;
        } else {
            diskon = 0;
        }

        total_bayar = total - diskon;

        // Output Struk
        System.out.println("\n===== Struk Pembayaran =====");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Barang  : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + total_bayar);
        System.out.println("============================");
    }
}
