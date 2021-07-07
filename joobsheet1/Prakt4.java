package Latihan;

import java.util.Scanner;

public class Prakt4 {
    public static void main(String[] args){

        Scanner P = new Scanner(System.in);
        int n = 9;
        int fib1 = 0;
        int fib2 = 1;

        System.out.println("Deret Fibonacci menggunakan Perulangan: ");
        fibIteratif(n, fib1, fib2);
        System.out.println("");
        System.out.println("\nDeret Fibbonaci menggunakan Fungsi Rekursif: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRekursif(i) + " " );

        }
        System.out.println("");
    }
    static void fibIteratif(int n, int fib1, int fib2) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1+" ");
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
    }
    static int fibRekursif(int n){
        if (n==0) {
            return 0;
        }else if (n==1) {
            return 1;
        }else{
            return fibRekursif(n-1) + fibRekursif(n-2);
        }
    }    
}
© 2021 GitHub, Inc.