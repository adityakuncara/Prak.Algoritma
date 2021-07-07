package object;

public class Lingkaran_Main {
     public static void main (String [] args){
         Lingkaran lgkr = new Lingkaran();
        lgkr.phi=3.14;
        lgkr.r=7;
         
         System.out.println("Luas Lingkaran = "+lgkr.hitungLuas());
         System.out.println("Keliling Lingkaran = "+lgkr.hitungKeliling());
     }
}