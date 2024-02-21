import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input suhu dalam reamur
        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = scanner.nextDouble();

        // Konversi ke Celcius
        double celcius = reamur * 5 / 4;

        // Konversi ke Fahrenheit
        double fahrenheit = (reamur * 9 / 4) + 32;

        // Konversi ke Kelvin
        double kelvin = celcius + 273.15;

        // Tampilkan hasil konversi
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
