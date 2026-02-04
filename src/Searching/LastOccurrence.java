package Searching;

import java.util.Scanner;

public class LastOccurrence {

    static int lastOccEleR(int[] arr, int x, int low, int high){

        int n = arr.length;

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] > x){
            return lastOccEleR(arr, x, low , mid-1);
        } else if (arr[mid] < x) {
            return lastOccEleR(arr, x, mid+1, high);
        }else {
            if(mid == n-1 || arr[mid] != arr[mid+1]){
                return mid;
            }else {
                return lastOccEleR(arr, x, mid+1, high);
            }
        }
    }

    static int lastOccEleL(int[] arr, int x){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] > x){
                high = mid-1;
            } else if (arr[mid] < x) {
                low = mid+1;
            }else {
                if(mid == n-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }else {
                    low = mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search its last occurrence: ");
        int x = sc.nextInt();


        int resultR = lastOccEleR(arr, x, 0, n);
        int resultL = lastOccEleL(arr, x);

        //By Recursive Method
        System.out.println(x + " last occurrence in the array is: " + resultR);

        //By Iterative Method
        System.out.println(x + " last occurrence in the array is: " + resultL);
    }
}
