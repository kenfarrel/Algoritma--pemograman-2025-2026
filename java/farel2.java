import java.util.scanner;
public class Main {
    public static void main(String[]args) {
        final double PI =3.14159;
        scanner sc=new scanner(System.in);
        System.out.print("Masukkan jari-jari:");
        double r =sc.nextDouble();
        double luas=PI*r*r;
        System.out.print("Luas lingkaran="+luas);
    }
}