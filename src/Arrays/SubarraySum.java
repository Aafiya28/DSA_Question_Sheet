package Arrays;

import java.util.HashMap;
import java.util.Map;
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

    //Longest subArray with sum K - Brute-Force Solution - TC - O(N^2). SC - O(1);
    static int longestSubArray(int[] arr, int k){

        int n=arr.length;

        int count = 0;
        int maxCount= 0;

        for(int i=0; i<n; i++){

            int currSum = 0;
            for(int j=i; j<n; j++){
                currSum += arr[j];

                if(currSum == k){

                    count = j-i+1;
                    maxCount = Math.max(count, maxCount);
                }
            }
        }

        return maxCount;
    }

    static int longestSubArrSum(int[] arr, int k){

        int n = arr.length;

        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == k){
                maxLen = i+1;
            }

            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i-preSumMap.get(rem);
                maxLen = Math.max(len, maxLen);
            }

            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
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

        System.out.println("Longest Sub Array Length: " + longestSubArrSum(arr, k));
    }
}
