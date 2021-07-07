package object;

import java.util.Scanner;

public class Games {
    int id;
    String namaMember;
    String namaGame;
    int lamaPinjam;
    int harga;
    
    void data (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan id : ");
        id=sc.nextInt();
        System.out.print("Nama : ");
        namaMember=sc.next();
        System.out.print("Nama Game :");
        namaGame=sc.next(); 
        System.out.print("Lama Sewa (hari) : ");
        lamaPinjam=sc.nextInt();
    }
    
    void output(){
        System.out.println("-------------------------------");
        System.out.println("Nama            : "+namaMember);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Lama Sewa (hari): "+lamaPinjam);
        System.out.println("Harga yang harus dibayar : "+ Sewa());
    }

    int Sewa(){
        harga=lamaPinjam*harga;
        return harga;
    }
}