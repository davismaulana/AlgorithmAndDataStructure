package Assignment45;

public class Queue {
    private LinkedList LL = new LinkedList();
    public void enqueue(Customer data){
        LL.addLast(data);
    }
    public Customer dequeue(){
        Customer data = LL.getData(0);
        LL.removeFirst();
        return data;
    }
    public void print(){
        Node temp = LL.head;
        while (temp != null){
            temp.data.print();
            temp = temp.next;
        }
    }
}
