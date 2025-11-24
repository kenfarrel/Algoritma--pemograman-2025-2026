import java.util.Scanner;

public class PerkenalanDiriInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");

        System.out.print("Nama Lengkap\t\t: ");
        String namaLengkap = input.nextLine();

        System.out.print("Tempat Lahir\t\t: ");
        String tempatLahir = input.nextLine();

        System.out.print("Tanggal Lahir\t\t: ");
        String tanggalLahir = input.nextLine();

        System.out.print("Jenis Kelamin\t\t: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Alamat Lengkap\t\t: ");
        String alamatLengkap = input.nextLine();

        System.out.print("No Hp\t\t\t: ");
        String noHp = input.nextLine();

        System.out.print("Penghasilan Sebulan\t: ");
        String penghasilanSebulan = input.nextLine();

        // Menampilkan hasil
        System.out.println("\n===== DATA DIRI ANDA =====");
        System.out.println("Nama Lengkap\t\t: " + namaLengkap);
        System.out.println("Tempat & Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin\t\t: " + jenisKelamin);
        System.out.println("Alamat Lengkap\t\t: " + alamatLengkap);
        System.out.println("No Hp\t\t\t: " + noHp);
        System.out.println("Penghasilan Sebulan\t: " + penghasilanSebulan);

        input.close();
    }
}