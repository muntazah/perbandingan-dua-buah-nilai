/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan24.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 024
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan24ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        
        System.out.println("============Program Perbandingan Nilai===========");

        do {
            System.out.print("Masukkan nilai pertama: ");
            double nilai1 = input.nextDouble();
            System.out.print("Masukkan nilai kedua: ");
            double nilai2 = input.nextDouble();

            if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            System.out.println();
            System.out.print("Ulangi perbandingan? (Ya/Tidak): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');
    }
}
