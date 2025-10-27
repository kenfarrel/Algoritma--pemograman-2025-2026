import java.util.scanner;

Public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukan angka kedua: ");
        int b = sc.nextInt();

        if (a>b)
          System.out.println(a + " lebih besar dari " + b);
        else if (a<b)
          System.out.println(a + " lebih kecil dari " + b);
        else
          System.out.println("Keduanya sama besar");
        
        System.out.println("Apakah Keduanya sama? " + (a==b));
    }
}