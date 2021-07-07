package object;

public class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;
    
    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(int a){
        
       if(a >100000){
        return a*10/100;
          
       } else if( a>=50000 && a<=100000){
          return a*5/100;
          
       }else {
         return 0;  
       } 
    }
    int hitungHargaBayar(int b, int a){
        return (a- b);
    }
}