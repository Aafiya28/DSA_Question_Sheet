package Arrays;

import java.util.Enumeration;

public class Pivot {

    /* *The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
     * to the sum of all the numbers strictly to the index's right.
    * */
    static int findPivot(int[] arr){

        int n = arr.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];
        for(int i=1; i<n; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for(int j=n-2; j>=0; j--){
            rightSum[j] = rightSum[j+1] + arr[j];
        }

        for(int i=0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        //Given an array of integers nums, calculate the pivot index of this array.
        int[] arr = {1,7,3, 5,6,5};

        System.out.println("Pivot of this array is: " + findPivot(arr));
    }
}
