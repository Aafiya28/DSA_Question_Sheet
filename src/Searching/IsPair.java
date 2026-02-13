package Searching;

import java.util.Scanner;

public class IsPair {

    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


    }
}
