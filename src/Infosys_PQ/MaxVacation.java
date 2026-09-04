package Infosys_PQ;

import java.util.*;

public class MaxVacation {

    public static int maxVacationDays(int N, int M, int K, int[] arr) {

        if (K >= M || M == 0) {
            return N;
        }

        Arrays.sort(arr);

        int left = 0;
        int maxDays = 0;

        for (int right = 0; right < M; right++) {

            int obligations = right - left + 1;

            while (obligations > K) {
                left++;
                obligations = right - left + 1;
            }

            int start = (left == 0) ? 1 : arr[left-1] + 1;

            int end = (right == M-1) ? N : arr[right+1] - 1;

            int days = end - start + 1;

            maxDays = Math.max(maxDays, days);
        }

        return maxDays;
    }

    public static void main(String[] args) {

        int N = 20;
        int M = 5;
        int K = 2;

        int[] arr = {3, 8, 12, 15, 18};

        System.out.println(maxVacationDays(N, M, K, arr));
    }
}