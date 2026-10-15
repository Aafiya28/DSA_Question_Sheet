package LinkedList;

import java.util.LinkedList;

public class Problems {

    Node head;
    int size;

    public static class Node{

        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
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

    //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    public static void search(LinkedList<Integer> list, int target){

        int idx = list.indexOf(target);

        if(idx != -1) {
            System.out.println("Element " + target + " is present at index: " + idx);
        }
    }

    // Take elements range of 1-50 of a Linked List as input from the user Delete all nodes which have values greater than 25.
    static void removeGreaterTarget(LinkedList<Integer> list, int target){

        for(int i=1; i<=50; i++){
            list.add(i);
        }
            System.out.println(list);

    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        search(list, 7);

        //Converting Array into Linked List
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Node head = convertArrToLL(arr);
        Node currNode = head;

        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

//        removeGreaterTarget();
        }

}
