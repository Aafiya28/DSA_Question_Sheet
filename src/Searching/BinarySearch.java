package Searching;

import java.util.Scanner;

public class BinarySearch {

    //Iterative Solution
    static int bSearchI(int[] arr, int x){

        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
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

    //Recursive Solution
    static int bSearchR(int[] arr, int x, int low, int high){

        int n = arr.length;

        int mid = (low + high)/2;

        if(low > high){
            return -1;
        }

        if(arr[mid] == x){
            return mid;
        }else if(arr[mid] > x){
            high = mid-1;
            return bSearchR(arr, x, low, high );
        }else {
            low = mid+1;
            return bSearchR(arr, x, low, high);
        }

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

        int resultI = bSearchI(arr, x);
        int resultR = bSearchR(arr, x, 0, n);

        System.out.println(x + " is present at index : " + resultI);
        System.out.println(x + " is present at index: " + resultR);
    }
}
