package LinkedList;

public class Circular_LL {

    class Node{

        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    int size;

    Circular_LL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push_front(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void push_back(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
    }

    public void pop_front(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public void pop_back(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        size--;
    }
    public void print(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        System.out.print(head.data + " -> ");
        Node temp = head.next;
        while (temp != head){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
//        System.out.print(temp.data + " -> ");
        System.out.println("back to head -> " + head.data);
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head); // Stop once we loop back around to the head

        System.out.println("(back to head) -> "+ head.data);

    }

    public static void main(String[] args) {

        Circular_LL cll = new Circular_LL();

        cll.push_front(6);
        cll.push_front(7);

        cll.push_back(8);
        cll.push_back(9);

        cll.print();

        cll.pop_front();
        cll.print();

        cll.pop_back();
        cll.print();
    }
}
