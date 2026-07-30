package Arrays;

import java.util.Arrays;

public class MaxDifference {

    static int maxDiff(int[] arr){

        int n=arr.length;

        int dif = arr[1] - arr[0];
        int minVal = arr[0];

        for(int i=1; i<n; i++){
            dif = Math.max(dif, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return dif;
    }

    public static void main(String[] args){

        int[] arr = {2,3,10,6,4,8,1};

        int result = maxDiff(arr);

        System.out.println("Maximum difference of the array is: " + result);

    }
}
