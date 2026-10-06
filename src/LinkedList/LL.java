package LinkedList;

import java.util.List;

public class LL {

    Node head;
    int size = 0;

    LL(){
       this.size = 0;
    }

    class Node{

        int data;
        Node next;

        Node(int value){
            this.data = value;
            this.next = null;
            size++;
        }
    }

    //Add First Operation
    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add Last Operation
    public void addLast (int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //Delete First Operation
    public void deleteFirst(){

        if(head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    //Delete Last Operation
    public void deleteLast(){

        if(head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //Travers and printing list node.
    public void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst(1);
        list.addFirst(2);

        list.printList();

        list.addFirst(3);
        list.printList();

        list.addLast(4);
        list.printList();

        System.out.println("Size of the LinkedList: " + list.getSize());

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of the LinkedList: " +  list.getSize());
    }
}
