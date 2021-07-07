package tugas4;

public class Node {

    Nasabah data;
    Node next;

    public Node(Nasabah nilai, Node berikutnya) {
        this.data = nilai;
        this.next = berikutnya;
    }

    public void tampilNasabah() {
        System.out.println("Nama \t\t : " + data.nama);
        System.out.println("Alamat \t\t : " + data.alamat);
        System.out.println("No Rek \t\t : " + data.noRek);
    }
}