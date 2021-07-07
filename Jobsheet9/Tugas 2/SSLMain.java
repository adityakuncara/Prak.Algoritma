package tugas2;

public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('C');
        singLL.print();
        singLL.insertAt(1, 'B');
        singLL.print();
        singLL.insertAfter('C', 'E');
        singLL.print();
        singLL.insertBefore('E', 'D');
        singLL.print();

    }

}
