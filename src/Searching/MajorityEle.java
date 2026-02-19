package Searching;

import java.util.Scanner;

public class MajorityEle {

    static int majorityEle(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > n/2){
                return arr[i];
            }
        }

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
