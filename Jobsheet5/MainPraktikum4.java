import java.util.Scanner;

public class MainPraktikum4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println(" Pemilihan Suara untuk Memilih Ketua BEM Tahun 2021 ");
        System.out.println("====================================================");
        praktikum4 bem = new praktikum4();
        praktikum4[] arr = new praktikum4[bem.jumlahKandidat];

        for (int i = 0; i < bem.jumlahKandidat; i++) {
            arr[i] = new praktikum4();
            System.out.print("Nama Kandidat ke- " + (i + 1) + " : ");
            arr[i].kandidat = in.nextLine();
        }
        System.out.println("===================================");
        for (int i = 0; i < bem.jumlahKandidat; i++) {
            System.out.print("Jumlah Suara Kandidat ke- " + (i + 1) + " : ");
            arr[i].suara = in.nextInt();
            bem.jumlahSuara += arr[i].suara;
        }
        System.out.println("==============================================================");
        int hasil = bem.Hitung(bem.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if (hasil == 0) {
            System.out.println("Masing-masing Kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah : " + arr[hasil - 1].kandidat);
        }

    }
}