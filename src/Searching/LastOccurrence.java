package Searching;

import java.util.Scanner;

public class LastOccurrence {

    static int lastOccEle(int[] arr, int x, int low, int high){

        int n = arr.length;

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] > x){
            return lastOccEle(arr, x, low , mid-1);
        } else if (arr[mid] < x) {
            return lastOccEle(arr, x, mid+1, high);
        }else {
            if(mid == n-1 || arr[mid] != arr[mid+1]){
                return mid;
            }else {
                return lastOccEle(arr, x, mid+1, high);
            }
        }
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
        int result = lastOccEle(arr, x, 0, n);

        System.out.println(x + " last occurrence in the array is: " + result);
    }
}
