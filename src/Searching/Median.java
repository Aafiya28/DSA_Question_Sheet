package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class Median {

    //finding median of two array

    static int medianOfArr(int[] arr1,  int[] arr2){

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> finalArr = new ArrayList<>();

        int i = 0, j = 0;

        // Merge both arrays
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                finalArr.add(arr1[i++]);
            } else {
                finalArr.add(arr2[j++]);
            }
        }

        // Add remaining elements
        while(i < n){
            finalArr.add(arr1[i++]);
        }

        while(j < m){
            finalArr.add(arr2[j++]);
        }


        int total = n + m;
        int med = 0;

        // Calculate median
        if(total % 2 == 0){
            return (finalArr.get(total/2) + finalArr.get(total/2 - 1)) / 2;
        } else {
            return finalArr.get(total/2);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int medResult = medianOfArr(arr1, arr2);

        System.out.println("Median of this arrays: " + medResult);
    }
}
