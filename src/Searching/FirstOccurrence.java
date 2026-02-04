package Searching;

import java.util.Scanner;

public class FirstOccurrence {

    //Recursive Solution
    static int firstOccEleR(int[] arr, int x, int low , int high){

        int n = arr.length;

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] > x){
                return firstOccEleR(arr, x, low, mid-1);
        } else if(arr[mid] < x){
            return firstOccEleR(arr, x ,mid+1, high);
        } else {
            if(mid == 0 || arr[mid] != arr[mid-1]){
                return mid;
            }else {
                return firstOccEleR(arr, x, low, mid-1);
            }
        }
    }

    static int firstOccEleL(int[] arr, int x){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        if(low > high){
            return -1;
        }

        while(low <= high){

            int mid = (low+high)/2;

            if(arr[mid] > x){
                high = mid-1;
            } else if (arr[mid] < x) {
                low = mid+1;
            }else {
                if(mid == 0 || arr[mid] != arr[mid-1]){
                    return mid;
                }else {
                    high = mid-1;
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

        System.out.print("Enter element to search its first occurrence: ");
        int x = sc.nextInt();

        int resultR = firstOccEleR(arr, x, 0, n);
        int resultL= firstOccEleL(arr, x);

        //By Recursive Method
        System.out.println(x + " first occurrence index in array is: " + resultR);

        //By Iterative Method
        System.out.println(x + " first occurrence index in array is: " + resultL);
    }
}
