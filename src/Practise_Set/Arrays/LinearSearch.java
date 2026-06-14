package Practise_Set.Arrays;

import java.util.Scanner;

public class LinearSearch {

    static void linearSearch(int[] arr, int target){

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println(target + " Present at " + i + "th index");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {23, 54, 45, 76, 63};

        System.out.print("Enter element to finding its index in array: ");
        int target = sc.nextInt();

        linearSearch(arr, target);
    }
}
