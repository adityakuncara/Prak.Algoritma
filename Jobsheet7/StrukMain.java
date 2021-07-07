/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author 
 */
import java.util.Scanner;
public class StrukMain {
    public static void main(String[] args) {
        Struk str = new Struk(8);
        Scanner sc = new Scanner (System.in);
        char pilih ;
        do{
            System.out.print("Nomor Transaksi\t\t\t : ");
            int nomor = sc.nextInt();
            
            System.out.print("Tanggal Pembelian \t\t: ");
            int tgl = sc.nextInt();
            
            System.out.print("Jumlah Barang yang dibeli\t : ");
            int jml = sc.nextInt();
            
            System.out.print("Total harga bayar \t\t : Rp. ");
            int harga = sc.nextInt();
            
            Tugas2 tg = new Tugas2(nomor,tgl,jml,harga);
            System.out.print("Apakah Anda akan menambahkan data baru kedalam stack? (y/n) : ");
            pilih = sc.next ().charAt(0); sc.nextLine();
            str.push(tg);
        } while (pilih == 'y');
        str.print();
        System.out.print("Masukkan jumlah struk yang akan diambil : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++){
            str.pop();
        }
        System.out.println("");
        str.print();
    }
}
