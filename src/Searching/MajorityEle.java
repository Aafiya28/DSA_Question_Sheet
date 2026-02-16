package Searching;

import java.util.Scanner;

public class MajorityEle {

    static int majorityEle(int[] arr){

        int n = 0;


        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int majorEle = majorityEle(arr);

        System.out.println("Majority Element of this array is: " + majorEle);
    }
}
