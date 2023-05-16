package Assignment45;

public class LinkedList {
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Linked list content : \t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked list is empty");
        }
    }
    public void addLast(Customer input){
        Node NodeIn = new Node(input, null);
        if (isEmpty()){
            head = NodeIn;
            tail = NodeIn;
        }else {
            tail.next = NodeIn;
            tail = NodeIn;
        }
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list is empty. Can't remove data");
        } else if (head.equals(tail)) {
            head = tail = null;
        }else {
            head = head.next;
        }
    }
    public Customer getData(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}
