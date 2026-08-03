package Infosys_PQ;

import java.util.PriorityQueue;

public class MaxTaste {

    static class Food {
        long taste;
        long decay;

        Food(long taste, long decay){
            this.taste = taste;
            this.decay = decay;
        }
    }

    public static long maxTaste(int n, int m, long[] taste, long[] decay){

        PriorityQueue<Food> pq = new PriorityQueue<>(
                (a, b) -> Long.compare(b.decay, a.taste)
        );

        for(int i=0; i<n; i++){
            pq.offer(new Food(taste[i], decay[i]));
        }

        long ans = 0;

        for(int i=0; i<m && !pq.isEmpty(); i++){

            Food curr = pq.poll();

            if(curr.taste <= 0)
                break;

            ans += curr.taste;

            long nextTasge = curr.taste - curr.decay;

            if(nextTasge > 0){
                pq.offer(new Food(nextTasge, curr.decay));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 3;
        int m =5;

        long[] v = {5,7,9};
        long[] d = {2,4,6};

        long ans = maxTaste(n, m, v, d);

        System.out.println(ans);
    }
}
