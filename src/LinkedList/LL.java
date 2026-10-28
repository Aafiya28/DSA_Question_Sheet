package LinkedList;

public class LL {

    private static class Node {

        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LL(){

        this.head = null;
        this.size = 0;
    }

    public Node addFirst(int data){

        Node newNode = new Node(data);
        if(head != null){
            newNode.next = head;
        }
        head = newNode;
        size++;

        return head;
    }

    public void addLast(int data){

        Node newNode = new Node(data);

        size++;
        if(head == null){
            head= newNode;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node deleteHead(){

        if(head == null){
            System.out.println("List is empty ");
        }

        size--;
        head = head.next;
        return head;
    }

    public Node deleteTail(){

        if(head == null){
            System.out.println("List is empty");
        }

        size--;

        if(head.next == null){
            head = null;
            return head;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null){
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;

        return head;
    }

    public int getSize(){
        return this.size;
    }

    public void printList(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.printList();

        list.addLast( 8);
        list.addLast( 9);
        list.printList();

        list.deleteHead();
        list.printList();

        list.deleteTail();
        list.printList();

        System.out.println(list.getSize());
    }
}
