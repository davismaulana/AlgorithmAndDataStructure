package Assignment2;

public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.addFirst("A");
        LL.print();
        LL.addLast("E");
        LL.print();
        LL.insertAfter("A","B");
        LL.print();
        LL.insertAfter("B","C");
        LL.print();
        LL.insertBefore("E","D");
        LL.print();
    }
}
