package Latihan;

import java.util.Scanner;

public class prakt1 {
    public static void main(String[] args) {

        Scanner P = new Scanner(System.in);
        int tugas, uts, uas;
        double tNilai;

        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("========================================");
        System.out.print("Masukkan Nilai Tugas Mahasiswa\t: ");
        tugas = P.nextInt();
        System.out.print("Masukkan Nilai UTS Mahasiswa\t: ");
        uts = P.nextInt();
        System.out.print("Masukkan Nilai UAS Mahasiswa\t: ");
        uas = P.nextInt();
        System.out.println("========================================");
        System.out.println("========================================");
        tNilai = ((0.20*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir Mahasiswa \t\t : " + tNilai);
        if (tNilai > 80 && tNilai <= 100) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : A");
        } else if (tNilai > 73 && tNilai <= 80) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : B+");
        } else if (tNilai > 65 && tNilai <= 73) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : B");
        } else if (tNilai > 60 && tNilai <= 65) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : C+");
        } else if (tNilai > 50 && tNilai <= 60) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : C");
        } else if (tNilai > 39 && tNilai <= 50) {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : D");
        } else {
            System.out.println("Kategori Nilai Huruf Mahasiswa\t : E");
        }
        System.out.println("========================================");
        if (tNilai > 80 && tNilai <= 100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (tNilai > 73 && tNilai <= 80) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (tNilai > 65 && tNilai <= 73) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (tNilai > 60 && tNilai <= 65) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (tNilai > 50 && tNilai <= 60) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (tNilai > 39 && tNilai <= 50) {
            System.out.println("MAAF TIDAK ANDA LULUS");
        } else {
            System.out.println("MAAF TIDAK ANDA LULUS");
        }
    }    
}