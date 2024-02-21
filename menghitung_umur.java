import java.util.Scanner;

public class HitungUmur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Hitung umur
        int umur = 2023 - tahunLahir;

        // Tampilkan hasil
        System.out.println("Umur: " + umur);
    }
}
