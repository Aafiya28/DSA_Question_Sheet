package LinkedList;

import java.util.LinkedList;
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

    public void reverseIterative(){

        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
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
    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    //Delete Nth Node from Starting
    public void deleteNthNode( int idx){

        if(head == null || idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return;
        }

        if(idx == 0){
            head = head.next;
            return;
        }

        Node curr = head;
        for(int i=1; i<idx-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;


    }

    public static void main(String[] args) {

        LL list = new LL();

        list.addLast(4);
        list.addLast(5);

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteFirst();
        list.printList();

//        System.out.println("Size of the LinkedList: " +  list.getSize());

//        list.reverseIterative();
//        System.out.print("After Revers Iterative Operation List is: ");
//        list.printList();

//        list.head =  list.reverseRecursive(list.head);
//        System.out.print("After Reverse Recursive Operation List is: ");
//        list.printList();


        list.deleteNthNode(3);
        System.out.print("After Delete 4th Node: ");
        list.printList();
    }
}
