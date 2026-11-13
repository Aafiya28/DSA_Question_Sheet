package Arrays;

public class MaximumSubArray {

    //Brute-force Approach : TC: O(N^2) * SC: O(1);
    static int getMaxSubArray(int[] arr){

        int n = arr.length;
        int maxSum = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // To be continue.............................
            }
        }

        return maxSum;
    }

    //Optimal Approach : TC: O(N) * SC: O(1);
    static int maxSubArray(int[] arr){

        int curr = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            curr = Math.max(arr[i] , curr+arr[i]);
            max = Math.max(max, curr);
        }

        return max;
    }



    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.print("Maximum Sub Array sum : " + maxSubArray(arr));
    }
}
