package Latihan;

import java.util.Scanner;

public class Prakt2 {
    public static void main(String[] args){

        Scanner P = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.print("Masukkan Nim: ");
        String NIM = P.nextLine();
        String substring = NIM.substring(NIM.length()-2);
        int N = Integer.parseInt(substring);

        N = (N < 10) ? N += 10 : N;
        System.out.println("==================");
        System.out.printf("NIM\t: %s\n", NIM);
        System.out.printf("N\t: %d\n", N);
        System.out.print("==================");
        int j = 0;
        for(int i = 0; i < N; i++) {
            if(i % 7 == 0) {
                j = 0;
                System.out.println();
            }
            System.out.print(hari[j] + " ");
            j++;
        }
    }    
}