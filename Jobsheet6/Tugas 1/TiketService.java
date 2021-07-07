public class TiketService {
    Tiket tikets[] = new Tiket[5];
    int tik;
    
    void Tambah(Tiket t) { 
        //method berparameter
        if (tik < tikets.length) {
            tikets[tik] = t;
            tik++;
        } else {
            System.out.println("Data Sudah Penuh !");
        }
    }
    void tampilAll() {
        for (Tiket t : tikets) {
            t.tampilAll();
            System.out.println("===============================================");
        }
    }
    void bubbleSort() {
        for (int i = 0; i < tikets.length; i++) {
            for (int j = 1; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[j - 1].harga) {
                    //dibawah ini proses swap atau penukaran
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < tikets.length; i++) {
            int hargaMin = i;
            for (int j = i + 1; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[hargaMin].harga) {
                    hargaMin = j;
                }
            }
        //swap
        Tiket tmp = tikets[hargaMin];
        tikets[hargaMin] = tikets[i];
        tikets[i] = tmp;
        }
    }
}