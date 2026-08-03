package Infosys_PQ;

import java.util.*;

public class MinCost {

    public static long getMinCost(int N, long A, long B){

        List<Integer> fibJumps = new ArrayList<>();

        int f1 = 1;
        int f2 = 2;

        fibJumps.add(1);

        while (f2 <= N){
            fibJumps.add(2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

        long dp[] = new long[N+1];

        Arrays.fill(dp, Long.MAX_VALUE);
        dp[1] = 0;

        for(int i=1; i<N; i++){

            if(dp[i] == Long.MAX_VALUE){
                continue;
            }

            for(int k : fibJumps){
                if(i+k <= N){
                    long jumpCost = A + B * k;
                    dp[i+k] = Math.min(dp[i+k], dp[i] + jumpCost);
                }else {
                    break;
                }
            }
        }

        return dp[N] == Long.MAX_VALUE ? -1 : dp[N];
    }


}
