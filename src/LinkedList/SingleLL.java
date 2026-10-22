package LinkedList;

import java.util.LinkedList;

public class SingleLL {

    static class Node{

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

    public SingleLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Insert Node at front
    public void push_front(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Insert Node at last
    public void push_back(int val){

        Node newNode = new Node(val);

        if(head == tail){
            head = newNode;
            tail = newNode;
            return;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
            size++;
    }

    //Delete Node from front
    public void pop_front(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
        }else {
            head = head.next;
        }

        size--;
    }

    //Delete Node from last
    public void pop_back(){

        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        size--;

        Node currNode = head;
        while (currNode.next != tail){
            currNode = currNode.next;
        }
        currNode.next = null;
        tail = currNode;
    }

    //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    public int search(int target){

         Node currNode = head;
         int index = 0;

         while (currNode != null){
             if(currNode.data == target){
                 return index;
             }
             currNode = currNode.next;
             index++;
         }

         return -1;
    }

    //Array to LinkedList
    public static Node convertArrToLL(int[] arr){

        if(arr == null || arr.length == 0){
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = newNode;
        }

        return head;


    }

    // Take elements range of 1-50 of a Linked List as input from the user Delete all nodes which have values greater than 25.
    public void removeGreaterTheTarget(int target){

        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        if(head != null && head.data > target){
            head = head.next;
            return;
        }

        if(head == null){
            tail = null;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            if(currNode.next.data > target){
                currNode.next = currNode.next.next;
                size--;
            }
            currNode = currNode.next;
        }

    }

    // Printing List
    void printList(){

        Node currNode =head;
        if(currNode == null){
            System.out.println("List is empty!");
            return;
        }

        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SingleLL list = new SingleLL();

        list.push_front(3);             //Push Node at front
        list.push_front(7);             // ...
        list.push_front(1);             // ...
        list.push_front(2);             // ...
        list.printList();                   // Printing List

        list.push_back(8);               // Push Node at back/last
        list.push_back(4);               // Push Node at last
        list.printList();                    // Printing List

        list.pop_back();                     // Pop/Delete Node from back/end
        list.pop_front();                    // Pop/Delete Node from front/starting
        list.printList();                    // Printing List

        int target = 7;
        int idx = list.search(7);

        System.out.println("Element " + target + " is at index: " + idx);

        //Task 1: Converting Array into Linked List
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node currNode = convertArrToLL(arr);
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

        System.out.println("\n--- Testing Range Filter (1-50, remove > 25) ---");

        // Task 2: Populate range 1-50, delete elements > 25
        SingleLL rangeList = new SingleLL();
        for (int i = 1; i <= 50; i++) {
            rangeList.push_back(i);
        }
        rangeList.printList();

        System.out.println("List before filtering nodes (> 25):");
        rangeList.printList();

    }

}
