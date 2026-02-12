package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakElement {

    static ArrayList<Integer> peakEle(int[] arr){

        int n = arr.length;

        ArrayList<Integer> peakValue = new ArrayList<>();

        for(int i=0; i<=n; i++){

            if(arr[i] >= arr[i+1]){
                peakValue.add(arr[i]);
            }

            if(arr[i+1] > arr[i] && arr[i+1] > arr[i+2]){
                peakValue.add(arr[i+1]);
            }
        }

        return peakValue;
    }

    static int getPeak(int[] arr){

        int n = arr.length;

        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if(mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }

        return -1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter no. of element in array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter elements in array: ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }

//        ArrayList<Integer> result = peakEle(arr);

        int arr[] = {5, 20, 40, 30, 20, 50, 60}, n = 7;


        int peakEle = getPeak(arr);

//        System.out.println("Peak Element of Array: " + result);
        System.out.println("Peak Element of Array: " + peakEle);
    }
}
