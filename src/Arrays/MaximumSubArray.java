package Arrays;

public class MaximumSubArray {

    //Brute-force Approach - TC: O(N^3), SC: O(1);
    static int getMaxSubArrSum(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }

    //Better Approach - TC: O(N^2), SC: O(1);
    static int getMaxSubArray(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    //Optimal Approach : TC: O(N), SC: O(1);
    static int maxSubArray(int[] arr){

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int curr = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            curr = Math.max(arr[i] , curr+arr[i]);
            max = Math.max(max, curr);
        }

        return max;
    }



    public static void main(String[] args) {

//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        System.out.print("Maximum Sub Array sum : " + getMaxSubArrSum(arr));
    }
}
