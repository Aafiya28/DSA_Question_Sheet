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

        int smallest = arr[0];
        int second_smallest = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(arr[i] != smallest){
                second_smallest = arr[i];
                break;
            }
        }

        second_smallest = (second_smallest == Integer.MAX_VALUE ? -1 : second_smallest);

        int largest = arr[n-1];
        int second_largest = Integer.MIN_VALUE;

        for(int i=n-2; i>=0; i--){
            if(arr[i] != largest){
                second_largest = arr[i];
                break;
            }
        }

        second_largest =  (second_largest == Integer.MIN_VALUE ? -1 : second_largest);
        System.out.println("Second Smallest Element: " + second_smallest + ", " + "Second Largest Element: " + second_largest);
    }

    //Better Solution - Second Smallest and Largest Element


    //Optimal Solution - Second Largest Element
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

    //Optimal Solution - Second Smallest Element
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

    /* Optimal Solution - Find Second Smallest and Second-Largest Element
     * Time Complexity: O(N), we do two linear traversals in our array.
     * Space Complexity: O(1), as we are using a constant
     */
    static void getSecondSLElement(int[] arr){

        int n = arr.length;

        if(n < 2){
            System.out.println(-1 + ", " + -1);
            return;
        }

        //Get Second Largest Element
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }else {
                if(slargest < arr[i] && arr[i] > largest){
                    slargest = arr[i];
                }
            }
        }

        slargest = (slargest == Integer.MIN_VALUE ? -1 : slargest);

        //Get Second Smallest Element
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        //Get Second Smallest
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

        second_smallest = (second_smallest == Integer.MAX_VALUE ? -1 : second_smallest);

        System.out.println("Second Smallest Distinct Element: " + second_smallest);
        System.out.println("Second Largest Distinct Element: " +  slargest);
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{3, 6, 2, 2, 9, 17, 8, 12};

        int[] arr = new int[]{1, 7, 7, 7, 7};
        System.out.println("Brute Force Solution: ");
        getSecondElement(arr);


        int secondLargest = secondLargest(arr);
        int secondSmallest = secondSmallest(arr);

        System.out.println("Optimal Solution: ");
        System.out.println("Second Smallest Element: " + secondSmallest + " & Second Largest Element of Array is: " + secondLargest);

        getSecondSLElement(arr);
    }
}
