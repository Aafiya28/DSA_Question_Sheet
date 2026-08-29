package Arrays;

import java.util.*;

public class MissingNum {

    //Brute Force Solution
    static int misNum(int[] arr){

        int n = arr.length;

        for(int i=0; i<=n; i++){
            int flat = 0;
            for(int j=0; j<n-1; j++){

                if(arr[j] == i){
                    flat = 1;
                    break;
                }
            }

            if(flat == 0) return i;
        }
        return  -1;
    }

    //Optimal Solution
    static int missingNum(int[] arr){

        int n = arr.length;

        int rangeSum = (n * (n+1)) / 2;

        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }

        return (rangeSum - arrSum);
    }

    // Method 2 using Xor.- Optimal Solution
    static int missingNumM2(int[] arr){

        int n = arr.length;

        int xorSum = 0;

        for(int a : arr){
            xorSum = xorSum ^ a;
        }

        for(int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }
    //Xor is used to finding unique value & missing num in the 0-n range bcz XorSum contain unique or missing num
    static int uniqueNum(int[] arr){

        int n = arr.length;

        int xorSum = 0;

        for(int a : arr){
            xorSum = xorSum ^ a;
        }

        // for find unique value return xorSum;
        return xorSum;
    }

    //Finding Missing Element from Duplicate Elements
    static List<Integer> missingInDub(int[] arr){

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        for(int idx = 0; idx<n; idx++){
            int value = Math.abs(arr[idx]);
            int pos = value - 1;

            if(arr[pos] > 0){
                arr[pos] = -arr[pos];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                int valueAtIindex = i+1;
                ans.add(valueAtIindex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 7, 8, 6, 2, 9, 5};

        System.out.println("Missing value in this array is:  " + missingNum(arr));

        System.out.println("Missing value by using Xor method : " + missingNumM2(arr));

        int[] num = {1, 3, 6, 3, 6, 2, 1};

        System.out.println("Unique value: " +  uniqueNum(num));

        int[] dupArr = {5, 2, 4, 1, 2};

        System.out.println("Missing Element in this duplicate elements array: " + missingInDub(dupArr));

        System.out.println(misNum(arr));
    }
}
