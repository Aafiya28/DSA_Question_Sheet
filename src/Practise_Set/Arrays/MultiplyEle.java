package Practise_Set.Arrays;

import java.util.Arrays;

public class MultiplyEle {

    static int[] multiplyBy10(int[] arr){

        int n = arr.length;

        int[] newArr = new int[n];

        for(int i=0; i<n; i++){
            newArr[i] = arr[i] * 10;
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5};

        System.out.println(Arrays.toString(multiplyBy10(arr)));
    }
}
