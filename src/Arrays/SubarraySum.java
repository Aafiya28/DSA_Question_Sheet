package Arrays;

import java.util.Scanner;

public class SubarraySum {

    static boolean subArrSum(int[] arr, int sum){

        int n=arr.length;
        int curr_sum = 0;
        int s = 0;

        for(int i=0; i<n; i++){
            curr_sum += arr[i];

            while (sum < curr_sum){
                curr_sum = arr[s];
                s++;
            }
            if(sum == curr_sum){
                return true;
            }
        }
        return false;
    }

    //Longest subArray with sum K
    public static int longestSubArray(int[] arr, int k){

        int n=arr.length;

        int maxLen = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){

                int currSum = 0;
                for(int l=i; l<=j; l++){
                    currSum += arr[l];
                }

                if(currSum == k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args){

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        boolean result = subArrSum(arr, k);

        System.out.println("Sum of Sub Array present: " + result);

        System.out.println("Longest Sub Array length: " + longestSubArray(arr, 15));
    }
}
