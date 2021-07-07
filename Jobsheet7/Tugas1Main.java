/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author entercomp
 */
import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
           Scanner in= new Scanner(System.in);
           System.out.print("Masukkan kalimat yang diinginkan : ");
           String kal=in.nextLine();
           
           Tugas1 tgs = new Tugas1(kal.length());
           System.out.println("Hasil :");
           tgs.PrintBalik(kal);
    }
}
