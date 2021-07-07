public class MainTiket {
    public static void main(String[] args) {
        TiketService ticket = new TiketService();
        Tiket t1 = new Tiket("Garuda Indonesia", 1500000, "Jakarta", "Bali");
        Tiket t2 = new Tiket("Lion Air", 1300000, "Surabaya", "Jakarta");
        Tiket t3 = new Tiket("Mandala Air", 1200000, "Yogyakarta", "Palembang");
        Tiket t4 = new Tiket("Wings Air", 700000, "Bali", "NTT");
        Tiket t5 = new Tiket("Nam Air", 1700000, "Surabaya", "NTT");
        
        ticket.Tambah(t1);
        ticket.Tambah(t2);
        ticket.Tambah(t3);
        ticket.Tambah(t4);
        ticket.Tambah(t5);
        
        System.out.println("Data Tiket sebelum sorting =");
        ticket.tampilAll();
        
        System.out.println("===================================================");
        System.out.println("Data Tiket setelah sorting desc berdasarkan harga (buble Sort");
        System.out.println("===================================================");
        ticket.bubbleSort();
        ticket.tampilAll();
        
        System.out.println("===================================================");
        System.out.println("Data Tiket setelah sorting asc berdasarkan harga");
        System.out.println("===================================================");
        ticket.selectionSort();
        ticket.tampilAll();
    }
}