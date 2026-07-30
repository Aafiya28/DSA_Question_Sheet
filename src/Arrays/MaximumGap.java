package Arrays;

import java.util.Arrays;

public class MaximumGap {

    static int maximumGap(int[] arr){

        int n = arr.length;

        if(n < 2){
            return 0;
        }

        int min = arr[0];
        int max = arr[0];

        for(int num : arr){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if(min == max){
            return 0;
        }

        int bucketSize = Math.max(1, (max - min)/(n-1));
        int bucketCount = (max - min)/ bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax= new int[bucketCount];
        boolean[] used = new boolean[bucketCount];

        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        for(int num : arr){

            int idx = (num - min)/bucketSize;

            bucketMin[idx] = Math.min(bucketMin[idx], num);
            bucketMax[idx] = Math.max(bucketMax[idx], num);

            used[idx] = true;
        }

        int maxGap = 0;
        int preMax = min;

        for(int i=0; i<bucketCount; i++){
            if(!used[i]){
                continue;
            }
            maxGap = Math.max(maxGap, bucketMin[i] - preMax);
            preMax = bucketMax[i];
        }

        return maxGap;
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 1};

        int ans = maximumGap(arr);

        System.out.println("Maximum Gap : " + ans);
    }
}
