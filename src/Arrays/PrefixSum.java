package Arrays;

import java.util.Scanner;

public class PrefixSum {

    static int findPrefixSum(int[] pSum, int l, int r) {

        int n = pSum.length;

        if (l == 0) {
            return pSum[r];
        }

        return pSum[r] - pSum[l - 1];
    }

    ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elment in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] preSum = new int[n];

        preSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        System.out.print("Enter starting and ending index to finding sum of prefix sum: ");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = findPrefixSum(preSum, l, r);

        System.out.println("Sum of Prefix is: " + ans);
    }
}
