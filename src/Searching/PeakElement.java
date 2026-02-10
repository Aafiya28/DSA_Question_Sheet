package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakElement {

    static ArrayList<Integer> peakEle(int[] arr){

        int n = arr.length;

        ArrayList<Integer> peakValue = new ArrayList<>();

        for(int i=0; i<n; i++){

            if(arr[i] >= arr[i+1]){
                peakValue.add(arr[i]);
            }

            if(arr[i+1] > arr[i] && arr[i+1] > arr[i+2]){
                peakValue.add(arr[i+1]);
            }
        }

        return peakValue;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = peakEle(arr);

        System.out.println("Peak Element of Array: " + result);
    }
}
