package Arrays;

import java.util.Arrays;

public class MissingNum {

    static int missingNum(int[] arr){

        int n = arr.length;

        int rangeSum = (n * (n+1)) / 2;

        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }

        return (rangeSum - arrSum);
    }

    // Method 2 using Xor.
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
    static int missingInDub(int[] arr){

        int n = arr.length;

        int xorEle = 0;

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            if(arr[i] > i){
                continue;
            }else {
                xorEle = arr[i];
            }
        }

        return  xorEle;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 7, 8, 6, 2, 9, 5};

        System.out.println("Missing value in this array is:  " + missingNum(arr));

        System.out.println("Missing value by using Xor method : " + missingNumM2(arr));

        int[] num = {1, 3, 6, 3, 6, 2, 1};

        System.out.println("Unique value: " +  uniqueNum(num));

        int[] dupArr = {3, 2, 4, 2, 5};

        System.out.println("Missing Element in this duplicate elements array: " + missingInDub(dupArr));
    }
}
