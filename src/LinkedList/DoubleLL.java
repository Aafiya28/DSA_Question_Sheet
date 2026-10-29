package LinkedList;

import java.util.LinkedList;

class Node {

    int data;
    Node next;
    Node prev;

    Node(int val){
        this.data = val;
        this.next = null;
        this.prev = null;
    }

    Node(int val, Node next, Node prev){
        this.data = val;
        this.next = next;
        this.prev = prev;
    }
}
public class DoubleLL {

    Node head;
    Node tail;
    int size;

    DoubleLL(){
        head = null;
        tail = null;
        size = 0;
    }


    //Push Node in front(starting).
    public void push_front(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //Push Node in back(end).
    public void push_back(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    //Pop Node from front(starting).
    public void pop_front(){

        if(head == null){
            System.out.println("Doubly LinkedList is Empty");
            return;
        }

        size--;
        Node temp = head;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        temp.next = null;
    }

    public void pop_back(){

        if(head == null){
            System.out.println("Double Linked List is Empty");
            return;
        }

        size--;
        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    public static Node convertArrToDll(int[] arr){

        // 1. Immediately handle the edge cases (Crucial for Amazon!)
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }


    public int getSize(){
        return this.size;
    }

    public void print(){

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void printList(Node head){

        while (head != null){
            System.out.print(head.data + " <=> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        //Task : Basic Add & Delete Operation in Doubly Linked List.
        DoubleLL dll = new DoubleLL();

        dll.push_front(1);
        dll.push_front(2);
        dll.push_front(3);
        dll.print();

        dll.push_back(4);
        dll.push_back(5);
        dll.print();

        dll.pop_front();
        dll.print();

        dll.pop_back();
        dll.print();

        System.out.println("Size of Doubly LL: " +  dll.getSize());

        //Task : Converting an Array into Doubly Linked List.
        int[] arr = {3,4,5,6,7};
        System.out.print("Before Converting Array into Double LL Array is: { ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("}");

        System.out.print("After Converting Array into Doubly LL : ");
        Node head = convertArrToDll(arr);
        printList(head);

    }

}
