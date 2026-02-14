package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakElement {

    static int getPeak(int[] arr){

        int n = arr.length;

        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return arr[mid];
            if(mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }

        return -1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int peakEle = getPeak(arr);

        System.out.println("Peak Element of Array: " + peakEle);
    }
}
