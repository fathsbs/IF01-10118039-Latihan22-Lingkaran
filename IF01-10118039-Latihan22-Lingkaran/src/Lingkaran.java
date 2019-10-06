
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat menghitung luas dan keliling lingkaran
 */
public class Lingkaran {

    int diameter, jariJari;
    double luasLingkaran, kelLingkaran;
    final double phi = 3.14;
    String validation;
    boolean valid = true;

    public void HasilLingkaran() {

        Scanner masuk = new Scanner(System.in);
        System.out.println("=========Perhitungan Lingkaran=========");

        while (valid = true) {
            
            System.out.print("Masukkan nilai diameter Lingkaran : ");
            validation = masuk.nextLine();

            if (validation.matches("[0-9]*")) {
                
                diameter = masuk.nextInt();

                //rumus-rumus
                jariJari = (diameter / 2);
                luasLingkaran = phi * jariJari * jariJari;
                kelLingkaran = phi * diameter;

                //output
                System.out.println("\n=========Hasil Perhitungan=========");
                System.out.printf("Jari-jari Lingkaran \t: " + "%d%n", jariJari);
                System.out.printf("Luas Lingkaran \t\t: " + "%.2f%n", luasLingkaran);
                System.out.printf("Keliling Lingkaran \t: " + "%.2f%n", kelLingkaran);
                valid = false;
                break;
            } else {
                //output
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
            }

        }
    }

    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.HasilLingkaran();

    }

}
