package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Second_Element {

    /* Brute Force Solution - Second Smallest and Largest Element
     * Time Complexity: O(N log N), for sorting the array.
     * Space Complexity: O(1), as we are using a constant amount of space for variables.
     */
    static void getSecondElement(int[] arr){

        int n = arr.length;

        if(n <= 2){
            System.out.println(-1 + ", " + -1);
            return;
        }

        Arrays.sort(arr);

        int smallest = arr[1];

        int largest = arr[n-2];

        System.out.println("Second Smallest Element: " + smallest + ", " + "Second Largest Element: " + largest);
    }

    //Better Solution - Second Smallest and Largest Element


    // Optimal Solution - Second Largest Element
    static int secondLargest(int[] arr) {
        int n = arr.length;

        if(n <= 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < n; ++i) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }

    static int secondSmallest(int[] arr){

        int n = arr.length;

        if(n <= 2){
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){

            if(arr[i] < smallest){
                second_smallest = smallest;
                smallest = arr[i];
            }else {
                if(arr[i] < second_smallest && arr[i] > smallest){
                    second_smallest = arr[i];
                }
            }
        }

        return second_smallest == Integer.MAX_VALUE ? -1 : second_smallest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 4, 9, 17, 8, 12};

        System.out.println("Brute Force Solution: ");
        getSecondElement(arr);


        int secondLargest = secondLargest(arr);
        int secondSmallest = secondSmallest(arr);

        System.out.println("Optimal Solution: ");
        System.out.println("Second Smallest Element: " + secondSmallest(arr) + " & Second Largest Element of Array is: " + secondLargest);

    }
}
