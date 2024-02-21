import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alas dan tinggi segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        // Hitung luas dan keliling
        double luas = 0.5 * alas * tinggi;
        double keliling = alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

        // Tampilkan hasil
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
}
