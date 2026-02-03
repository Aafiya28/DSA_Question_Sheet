package Searching;

import java.util.Scanner;

public class BinarySearch {

    static int bSearch(int[] arr, int x){

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter element's in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element to search: ");
        int x = sc.nextInt();

        int result = bSearch(arr, x);

        System.out.println(x + " is present at index : " + result);
    }
}
