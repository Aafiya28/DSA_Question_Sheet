package Arrays;

import java.util.Scanner;

public class SubarraySum {

    static boolean subArrSum(int[] arr, int sum){

        int n=arr.length;
        int curr_sum = 0;
        int s = 0;

        for(int i=0; i<n; i++){
            curr_sum += arr[i];

            while (sum < curr_sum){
                curr_sum = arr[s];
                s++;
            }
            if(sum == curr_sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of element of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum of sub array: ");
        int sum = sc.nextInt();

        boolean result = subArrSum(arr, sum);

        System.out.println("Sum of Sub Array present: " + result);
    }
}
