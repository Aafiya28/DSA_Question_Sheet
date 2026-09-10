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

        //Second Smallest Element
        int smallest = arr[0];
        int second_smallest = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(arr[i] != smallest){
                second_smallest = arr[i];
                break;
            }
        }

        second_smallest = (second_smallest == Integer.MAX_VALUE ? -1 : second_smallest);

        //Second Largest Element
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

    /* Better Solution - Find Second Smallest and Second-Largest Element
     * Time Complexity: O(2N), we do two linear traversals in our array.
     * Space Complexity: O(1), as we are using a constant
     */
    static void get2Smallest(int[] arr){

        int n = arr.length;

        if(n < 2){
            System.out.println(-1);
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] < second_smallest && arr[i] > smallest){
                second_smallest = arr[i];
            }
        }

        second_smallest = (second_smallest == Integer.MAX_VALUE ? -1 : second_smallest);

        System.out.println("Second Smallest Element is: " + second_smallest);
    }

    static void get2Largest(int[] arr){

        int n = arr.length;

        if(n < 2){
            System.out.println(-1);
            return;
        }

        int largest = arr[0];
        int second_largest = -1;

        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > second_largest && arr[i] < largest){
                second_largest = arr[i];
            }
        }

        System.out.println("Second Largest Element is: " + second_largest);
    }

    static void secondElement(int[] arr){

        get2Smallest(arr);
        get2Largest(arr);
    }


    /* Optimal Solution - Find Second Smallest and Second-Largest Element
     * Time Complexity: O(N), we do two linear traversals in our array.
     * Space Complexity: O(1), as we are using a constant
     */
    //Optimal Solution - Second-Largest Element
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

    static void getSecondSLElement(int[] arr){

        int second_smallest = secondSmallest(arr);
        int second_largest = secondLargest(arr);

        System.out.println("Second Smallest Distinct Element: " + second_smallest);
        System.out.println("Second Largest Distinct Element: " +  second_largest);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 2, 9, 17, 8, 12};
//        int[] arr = new int[]{1, 1, 7, 7, 7};

        System.out.println("Brute Force Solution: ");
        getSecondElement(arr);

        System.out.println("Batter Solution: ");
        secondElement(arr);

        System.out.println("Optimal Solution: ");
        getSecondSLElement(arr);
    }
}
