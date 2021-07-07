package tugas3;

public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Enqueue(int antrian, String nama) {
        if (isEmpty()) {
            addFirst(antrian, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, antrian, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void addFirst(int antrian, String nama) {
        if (isEmpty()) {
            head = new Node(null, antrian, nama, null);
        } else {
            Node newNode = new Node(null, antrian, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");

        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("|" + tmp.antrian + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

}