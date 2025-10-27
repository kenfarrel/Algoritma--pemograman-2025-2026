import java.util.scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai tugas: ");
        doble tugas = sc.nextDouble();
        System.out.print("Masukan nilai uts: ");

        double uts = sc.nextDouble();
        System.out.print("Masukan nilai uas: ");
        double uas = sc.nextDouble();

        double nilaiAkhir = (0.3*tugas) + (0.3*uts) + (0.4*uas);
        System.out.println("NilaiAkhir = " + nilaiAkhir);
        if (nilaiAkhir>=60)
          system.out.println("Status: LULUS");
        else
          system.out.println("Status: TIDAK LULUS");
    }
}