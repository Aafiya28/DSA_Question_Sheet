package Arrays;

import java.util.*;

class Largest_Element {

    //Brute Force Solution
    static int largestEle(int[] arr){

        //Sort an array
        Arrays.sort(arr);

        //return last element of an array (array.length - 1);
        return arr[arr.length-1];
    }

    //Optimal Solution
    static int largest(int[] arr){

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
