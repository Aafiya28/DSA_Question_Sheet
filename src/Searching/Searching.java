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
                bSearch(arr, x, low, high);
            }else {
                low = mid+1;
                bSearch(arr, x, low, high);
            }
        }
        return -1;
    }

    //Search in Infinite sized array
    static int seacrhIS(int[] arr, int x){



        return -1;
    }

    //search in Sorted Rotated Array


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

//        int result = searchISA(arr, x, 0, n);

//        System.out.println(x + " is appear at index: " + result);
    }
}
