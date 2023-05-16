package Assignment2;

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
    public void addFirst(String input){
        Node NodeIn = new Node(input, null);
        if (isEmpty()){
            head = NodeIn;
            tail = NodeIn;
        }else {
            tail.next = NodeIn;
            tail = NodeIn;
        }
    }
    public void addLast(String input){
        Node NodeIn = new Node(input, null);
        if (isEmpty()){
            head = NodeIn;
            tail = NodeIn;
        }else {
            tail.next = NodeIn;
            tail = NodeIn;
        }
    }
    public void insertAfter(String key, String input){
        Node NodeIn = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.equals(key)){
                NodeIn.next = temp.next;
                temp.next = NodeIn;
                if (NodeIn.next == null) tail=NodeIn;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertBefore(String key, String input){
        Node NodeIn = new Node(input, null);
        Node  temp = head;

        if (temp.data.equals(key)){
            NodeIn.next = head;
            head = NodeIn;
            return;
        }
        while (temp.next != null){
            if (temp.next.data.equals(key)){
                NodeIn.next = temp.next;
                temp.next = NodeIn;
                return;
            }
            temp = temp.next;
        }
    }
}
