package Latihan;

public class Prakt3 {
    public static void main(String[] args){

        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int[] stock = new int[4];
        int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;

        //hitung jumlah stock
        for(int i = 0; i < bunga.length; i++) {
            for(int j = 0; j < bunga.length; j++) stock[i] += bunga[j][i];
        }
        System.out.println("Stock lama");
        for(int i = 0; i < stock.length; i++) {
            System.out.println("Stock bunga ke-" + (i+1) + " : " + stock[i] + " (di seluruh cabang)");
        }
        bunga[0][0] -= 1;
        bunga[0][1] -= 2;
        bunga[0][3] -= 5;
        int[] stockBaru = new int[4];
        for(int i = 0; i < bunga.length; i++) {
            for(int j = 0; j < bunga.length; j++)
                stockBaru[i] += bunga[j][i];
        }
        System.out.println("\nStock baru");
        for(int i = 0; i < stock.length; i++) {
            System.out.println("Stock bunga ke-" + (i+1) + " : " + stockBaru[i] + " (di seluruh cabang)");
        }
        int total = 0;
        for(int i = 0; i < bunga.length; i++) {
            if(i == 0) {
                total += (bunga[0][0] * aglonema);
            } else if(i == 1) {
                total += (bunga[0][1] * keladi);
            } else if(i == 2) {
                total += (bunga[0][2] * alocasia);
            } else {
                total += (bunga[0][3] * mawar);
            }
        }
        System.out.printf("Keuntungan total yang didapat RoyalGarden1 adalah Rp. %d\n",total);
    }    
}