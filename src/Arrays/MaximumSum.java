package Arrays;

import java.util.Scanner;

public class MaximumSum {

    static int maxSum(int[] arr){

        int n = arr.length;
        int maxEnd = arr[0];
        int res = arr[0];

        for(int i=1; i<n; i++){
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(maxEnd, res);
        }

        return res;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element in array: ");
        int n = sc.nextInt();

        int[] arr =  new int[n];

        System.out.print("Enter elment in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = maxSum(arr);
        System.out.println("Maximum of sum in this array: " + result);
    }
}
