package Arrays;

import java.util.*;

class Largest_Element {

    //Brute Force Solution - TC - O(NlogN) * SC - O(N).
    static int largestEle(int[] arr){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Optimal Solution - TC - O(N) * SC - O(1).
    static int largest(int[] arr){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int n = arr.length;

        int largest = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 23, 7, 12, 9, 16};

        int largest_value = largest(arr);

        System.out.println("Largest value of this array: " + largest_value);
    }
}
