package Searching;

import java.util.Scanner;

public class MinPage {

    static int minimumPage(int[] arr, int k){

        int n = arr.length;


        for(int i=0; i<n; i++){

        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n =sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = minimumPage(arr, k);
    }
}
