package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LL {

    class Node{
        int data;
        Node next;

        //Node Class Constructor
        Node(int value){
            this.data = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    // LL Class Constructor
    LL(){
        this.head = null;
        this.tail = null;
       this.size = 0;
    }

    //Add First Operation.
    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //Add Last Operation.
    public void addLast (int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    //Delete First Operation.
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }

        int headNode = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return headNode;
    }

    //Delete Last Operation.
    public Node deleteLast(){

        if(head == null){
            System.out.println("This list is empty");
            return null;
        }

        size--;
        if(head.next == null){
            head = null;
            return head;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }

    //Travers and printing list node.
    public Node printList(Node head){
        if(head == null){
            System.out.println("List is empty!");
            return null;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

        return head;
    }

    //Get Size of Linked List.
    public int getSize(){
        return size;
    }

    //Iterative Method to Reverse List.
    public Node reverseIterative(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prevNode = null;
        Node currNode = head.next;

        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

        return head;
    }

    //Recursive Method to Reverse List.
    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    //Delete Nth Node from Starting.
    public Node deleteNthNode( int idx){

        if(head == null || idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return null;
        }

        if(idx == 0){
            head = head.next;
            size--;
            return head;
        }

        Node curr = head;
        for(int i=0; i<idx-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;

        return head;
    }

    //Delete Nth Node form Last.
    public Node deleteNthNodeL(int index){

        if(head == null || index < 0 || index > size){
            System.out.println("Invalid Index");
            return null;
        }

        if (index == size) {
            head = head.next;
            size--;
            return head;
        }

        int idx = size-index;

        Node curr = head;
        for(int i=0; i<idx-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;

        return head;
    }

    public Node deletingNode(Node head, int X){

        if(head == null){
            return null;
        }

        if(head.data == X){
            size--;
            return head.next;
        }

        Node currNode = head;

        while(currNode.next != null){
            if(currNode.next.data == X){
                currNode.next = currNode.next.next;
                size--;
                break;
            }
            currNode = currNode.next;
        }

        return head;
    }

    //Main Method/Function.
    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(6);

        list.printList(list.head);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.print("Before deleting last node : ");
        list.printList(list.head);

        list.deleteLast();
        System.out.print("After deleting last node : ");
        list.printList(list.head);

        list.deleteFirst();
        list.printList(list.head);

        System.out.println("Size of the LinkedList: " +  list.getSize());

//        Reversing List by Iterative Method
//        list.reverseIterative(list.head);
//        System.out.print("After Revers Iterative Operation List is: ");
//        list.printList(list.head);

//        Reverse List by Recursive Method
//        list.head =  list.reverseRecursive(list.head);
//        System.out.print("After Reverse Recursive Operation List is: ");
//        list.printList(list.head);

        System.out.print("Before Deleting 3rd Node from Start, List is: ");
        list.printList(list.head);
        list.deleteNthNode(3);
        System.out.print("After Delete 3th Node from Start: ");
        list.printList(list.head);

        System.out.print("Before Deleting 2nd Node from End, List is: ");
        list.printList(list.head);
        list.deleteNthNodeL(2);
        System.out.print("After Delete 2nd Node from End: ");
        list.printList(list.head);


        System.out.println("Delete Node : " + 7);
        list.deletingNode(list.head, 7);

        list.printList(list.head);


    }
}
