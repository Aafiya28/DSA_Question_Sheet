package Arrays;

import java.util.Scanner;

public class MaximumSum {

    //Kadane's Algorithm, which finds the Maximum Sum SubArray in O(n) time and O(1) space.
    static int maxSum(int[] arr){

        int n = arr.length;

        int maxEnd = arr[0];
        int res = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i=1; i<n; i++){
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(maxEnd, res);
        }

        return res;
    }

    public static void main(String[] args){

        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int result = maxSum(arr);
        System.out.println("Maximum of sum in this array: " + result);
    }
}
