package Perbankan;

public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    
    Transaksi(double a, double b, double c, String d, String e){
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.type = d;
        this.tanggalTransaksi = e;
    }
}
