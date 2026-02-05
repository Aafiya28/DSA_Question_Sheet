package Searching;

import java.util.Scanner;

public class CountOccurrence {

    static int countOcc(int[] arr, int x){

        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                count++;
            }
        }

        return count;
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

        System.out.print("Enter elements to find its occurrence's: ");
        int x = sc.nextInt();

        int result = countOcc(arr, x);

        System.out.println("Occurrence of " + x + " is: " + result);
    }
}
