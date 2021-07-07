package object;

import java.util.Scanner;

public class Barang_main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Barang br=new Barang();
       
        System.out.print("Masukkan nama barang : ");
        br.nama=sc.nextLine();
        System.out.print("Harga Satuan :");
        br.hargaSatuan=sc.nextInt(); 
        System.out.print("Jumlah barang : ");
        br.jumlah=sc.nextInt();
        
        int a=br.hitungHargaTotal();
        int b=br.hitungDiskon(a);
        int c=br.hitungHargaBayar(b,a);
        System.out.println("Harga Total : "+ br.hitungHargaTotal());
        System.out.println("Diskon : "+ br.hitungDiskon(a));
        System.out.println("Harga bayar : "+br.hitungHargaBayar(b, a));    
    }
}