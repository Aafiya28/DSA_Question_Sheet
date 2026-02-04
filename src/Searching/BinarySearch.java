package Searching;

import java.util.Scanner;

public class BinarySearch {

    static int bSearch(int[] arr, int x){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low < high){
            int mid = (low+high)/2;

            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] > x){
                high = mid-1;
            }else {
                low = mid+1;
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

        System.out.print("Enter target element to search: ");
        int x = sc.nextInt();

        int result = bSearch(arr, x);

        System.out.println(x + " is present at index : " + result);
    }
}
