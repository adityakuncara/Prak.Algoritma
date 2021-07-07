package tugas2;

public class Node {

    String judulBuku;
    Node prev, next;

    Node(Node prev, String judulBuku, Node next) {
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;

    }
}