package LinkedList;

import java.util.List;

public class LL {

    private  Node head;
    class Node{

        int data;
        Node next;

        Node(int value){
            this.data = value;
            this.next = null;
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

    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst(10);
        list.addFirst(16);

        list.addFirst(34);
        list.addLast(43);

        list.printList();
    }
}
