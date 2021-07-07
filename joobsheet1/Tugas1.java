package Latihan;

public class Tugas1 {
        public static void main(String[] args) { 
            int tarifPerKg = 4500;
            int [] bajuMasuk = new int [4]; 
            bajuMasuk [0] = 4;
            bajuMasuk [1] = 15;
            bajuMasuk [2] = 6;
            bajuMasuk [3] = 11;

            int i = 0;
            int totalHarga = 0; for (i = 0; i < 4; i++){
            
                if (bajuMasuk[i] <= 10) {
                    totalHarga += bajuMasuk[i] * 4500;
                }else {
                    totalHarga += (bajuMasuk[i] * 4500) - 5/100;
                }
            }
            System.out.println("==================================");
            System.out.println("	Baju Masuk"); System.out.println("==================================");
            System.out.println("1. Ani = 4kg"); System.out.println("2. Budi = 15kg"); System.out.println("3. Bina = 6kg"); System.out.println("4. Cita = 11kg");
            System.out.println("==================================");
            System.out.println("Harga Per Kg = 4500"); System.out.println("Diskon Setiap 10Kg keatas 5%"); System.out.println("Total Pendapatan : "+totalHarga); System.out.println("==================================");
        }
}