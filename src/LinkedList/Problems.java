package LinkedList;

import java.util.LinkedList;

public class Problems {

    //  Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    public static void search(LinkedList<Integer> list, int target){

        int idx = list.indexOf(target);

        if(idx != -1) {
            System.out.println("Element " + target + " is present at index: " + idx);
        }
    }

    // Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
    // Delete all nodes which have values greater than 25.
    static void removeGreaterTarget(LinkedList<Integer> list, int target){

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

        }

}
