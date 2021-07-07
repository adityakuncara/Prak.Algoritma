package Latihan;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in); 
        menu();
    }

static void menu(){ 
    int pilihan;
    Scanner sc = new Scanner(System.in); 
    do {
        System.out.println("================================");
        System.out.println("	Daftar Menu"); 
        System.out.println("================================");
        System.out.println("1.Luas Segitiga"); 
        System.out.println("2.Luas Persegi"); 
        System.out.println("3.Luas Lingkaran"); 
        System.out.print("Masukkan Pilihan : "); 
        pilihan = sc.nextInt();
        System.out.println("================================");

        switch(pilihan){
            case 1 : luasSegitiga(); break;
            case 2 : luasPersegi(); break;
            case 3 : luasLingkaran();
        }
    }

    while (pilihan == 1); 
    System.out.println();

}
static void luasSegitiga() {
    Scanner sc = new Scanner(System.in); 
    int a, t;
    double luas; System.out.println("==================================");
 
    System.out.println("	Menghitung Luas Segitiga"); System.out.println("==================================");
    System.out.print("Masukan Alas : "); a = sc.nextInt();
    System.out.print("Masukan Tinggi : "); t = sc.nextInt();

    luas=0.5*a*t;
    System.out.println("Luas Segitiga : "+luas); System.out.println("==================================");
}


static void luasPersegi () {
    Scanner sc = new Scanner(System.in);

    int panjang, lebar, luas; 
    System.out.println("==================================");
    System.out.println("	Menghitung Luas Persegi"); 
    System.out.println("==================================");

    System.out.print("Masukan Panjang		: "); 
    panjang = sc.nextInt(); 
    System.out.print("Masukan Lebar	: "); 
    lebar = sc.nextInt();

    luas=panjang*lebar;

    System.out.println("Luas Persegi Panjang : "+luas); 
    System.out.println("==================================");
}


static void luasLingkaran (){
    Scanner input=new Scanner(System.in); double luas, phi=3.14;
    int r; 
    System.out.println("==================================");
    System.out.println("	Menghitung Luas Lingkaran"); 
    System.out.println("==================================");
    System.out.print("Masukan Jari-jari : "); 
    r=input.nextInt();
    luas=phi*r*r;
    System.out.println("Luas Lingkaran = "+luas);
    System.out.println("==================================");
}
}