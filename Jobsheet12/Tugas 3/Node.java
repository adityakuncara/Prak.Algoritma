package tugas3;

public class Node {

    int antrian;
    String nama;
    Node prev, next;

    Node(Node prev, int antrian, String nama, Node next) {
        this.prev = prev;
        this.antrian = antrian;
        this.nama = nama;
        this.next = next;
    }

}