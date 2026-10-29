
package Pertemuan2;

import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Menghitung luas persegi panjang
        float panjang = 2;
        float lebar = 5;
        float luasPersegiPanjang;

        luasPersegiPanjang = panjang * lebar;

        System.out.println(" LUAS PERSEGI PANJANG ");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas = " + luasPersegiPanjang);

        // 2. Menghitung luas dan keliling lingkaran
        float jari, luasLingkaran, keliling;
        final float PI = 3.14f;
        
        System.out.println("");
        System.out.println(" LINGKARAN ");
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();

        luasLingkaran = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas lingkaran = " + luasLingkaran);
        System.out.println("Keliling lingkaran = " + keliling);

        // 3. Menghitung total detik
        int jam, menit, detik, totalDetik;

        System.out.println("");
        System.out.println(" KONVERSI WAKTU ");
        System.out.print("Masukkan jam: ");
        jam = input.nextInt();

        System.out.print("Masukkan menit: ");
        menit = input.nextInt();

        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        totalDetik = jam * 3600 + menit * 60 + detik;

        System.out.println("Total detik = " + totalDetik);

        input.close();
    }
}
