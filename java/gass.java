import java.util.Scanner;

public class PerkenalanDiriInput {

public static void main(String[]args) {
    scanner input = new Scanner(System.in);

    // input data diri pegguna
    system.out.println("Assalamu'alaikum");
    system.out.println(Izinkan saya memperkenalkan diri");

    system.out.print("Nama Lengkap\t\t: ");
    string namaLengkap = input.nextLine();

    system.out.print("Tempat Lahir\t\t: ");
    string tempatLahir = input.nextLine();
    
    system.out.print("Tanggal Lahir\t\t: ");
    string tanggalLahir = input.nextLine();

    system.out.print("Jenis Kelamin\t\t: ");
    string jenisKelamin = input.nextLine();

    system.out.print("Alamat Lengkap\t\t: ");
    string alamatLengkap = input.nextLine();

    system.out.print("No Hp\t\t\t: ");
    string noHp = input.nextLine();

    system.out.print("Penghasilan Sebulan\t: ");
    string penghasilanSebulan = input.nextLine();

    // menampilkan hasil
    system.out.println("\n===== DATA DIRI ANDA =====");
    system.out.println("Nama Lengkap\t\t: " + namaLengkap);
    system.out.println("Tempat & Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
    system.out.println("Jenis Kelamin\t\t: " + jenisKelamin);
    system.out.println("Alamat Lengkap\t\t: " + alamatLengkap);
    system.out.println("No Hp\t\t\t: " + noHp);
    system.out.println("Penghasilan Sebulan\t: " + penghasilanSebulan);
    input.close();
    }
}
    