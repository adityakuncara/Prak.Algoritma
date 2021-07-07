package Latihan;

import java.util.Scanner;

public class Tugas3 {
   public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int deret[] = new int[n];

        System.out.println("=========================="); 
        System.out.print("Masukkan Nilai N : ");
        int i = 0;
        
        for (int j = 2; j > 1; j++) { 
            if (i < n) {
                if (deret[i] == 0) { 
                    if (j % 4 == 0) {
                        continue;
                    } else if (j % 2 == 0) { 
                        deret[i] = j;
                        i++;
                        System.out.print(j + " ");
                    } else {
                    continue;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(5); System.out.println("==========================");
    } 
}