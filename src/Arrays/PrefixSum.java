package Arrays;

import java.util.Scanner;

public class PrefixSum {

    static int findPrefixSum(int[] pSum, int l, int r){

        int n = pSum.length;

        if(l == 0){
            return pSum[r];
        }

        return  pSum[r] - pSum[l-1];
    };

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elment in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] preSum = new int[n];

        preSum[0] = arr[0];

        for(int i=1; i<n; i++){
            preSum[i]  = preSum[i-1] + arr[i];
        }

        System.out.print("Enter starting and ending index to finding sum of prefix sum: ");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = findPrefixSum(preSum, l, r);

        System.out.println("Sum of Prefix is: " + ans);
    }



    public static class SubarraySum {

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
}
