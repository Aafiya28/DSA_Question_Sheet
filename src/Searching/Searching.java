package Searching;

import java.util.Scanner;

public class Searching {

    //Binary Search
    static int bSearch(int[] arr, int x, int low, int high){

        int n = arr.length;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == x){
                return mid;
            } else if (arr[mid] > x) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    //Search in Infinite sized array
    static int searchIS(int[] arr, int x) {

        if (arr.length == 0) return -1;
        if (arr[0] == x) return 0;

        int i = 1;

        while (i < arr.length && arr[i] < x) {
            i = i * 2;
        }

        int low = i / 2;
        int high = Math.min(i, arr.length - 1);

        return bSearch(arr, x, low, high);
    }


    //search in Sorted Rotated Array
    static int rotatedSort(int[] arr, int x){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low <= high){

            int mid = (low+high)/2;

            if(x == arr[mid]){
                return mid;
            }

            if( arr[low] <= arr[mid]){
                if(x >= arr[low] && x < arr[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }else {
                if(x > arr[mid] && x <=arr[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter element in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int resultI = searchIS(arr, x);
        int resultR = rotatedSort(arr, x);

        System.out.println("Infinite array search index: " + resultI);
        System.out.println("Rotated array search index: " + resultR);

        sc.close();
    }
}
