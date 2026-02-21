package Searching;

import java.util.Scanner;

public class IsPair {

    static boolean pair(int[] arr, int x){

        int n = arr.length;

        int left = 0;
        int right = n-1;

        while(left <right){

            int sum = arr[left] + arr[right];
            if(sum == x){
                return true;
            } else if (sum > x) {
                right--;
            }else {
                left++;
            }
        }

        return false;
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

        System.out.print("Enter number to searching its pair present or not: ");
        int x = sc.nextInt();


        boolean result = pair(arr, x);

        System.out.println("Is pair of " + x + " is present : " + result);

    }
}
