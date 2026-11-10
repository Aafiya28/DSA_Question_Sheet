package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Longest_SubArray_K {

    /*Longest Sub Array of sum K. */

    //Brute - force approach - TC: O(N^2) * SC: O(1).
    static int longest_SubArray(int[] arr, int K){

        int length = arr.length;
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<length; i++){
            int currSum = 0;
            for(int j=i; j<length; j++){
                currSum += arr[j];
                if(currSum == K){
                    count = j- i + 1;
                    maxCount = Math.max(count, maxCount);
                }
            }
        }
        return maxCount;
    }

    //Optimal Solution - TC: O(N) * SC: O(1).
    static int getLongest_SubArray_Sum_K(int[] arr, int K){

        int n = arr.length;
        int maxLen = 0;
        int sum = arr[0];

        int left = 0;
        int right = 0;

        while (right < n){
            while (left <= right && sum > K){
                sum -= arr[left];
                left++;
            }
            if(sum == K){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

//        int[] arr = {10, 5, 1, 7, 2, 9};
        int[] arr=  {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int K = 3;

        int subArrayLength = longest_SubArray(arr, K);
        System.out.println("Longest Sub Array Length of Sum K: " + subArrayLength);

        System.out.println("###### Optimal Solution : ######");
        int longestLen = getLongest_SubArray_Sum_K(arr, 7);
        System.out.println("Longest sum Array Length : " + longestLen);


    }

}
