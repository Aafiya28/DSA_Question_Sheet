package Arrays;

import java.util.*;

public class TwoSum {

    //Brute-force Approach - TC: O(N²) * SC: O(1).
    /* Brute-Force (Nested Loops) Memory is strictly zero and N is very small.*/
    static int[] getTwoSum(int[] arr, int target){

        if (arr == null || arr.length < 2) return new int[]{-1, -1};

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    //Optimal Approach - TC: O(N) * SC: O(N).
    /* HashMap (Single Pass) Standard Two Sum (unsorted array, must return original indices).*/
    static int[] twoSum(int[] arr, int target){

        if (arr == null || arr.length < 2) return new int[]{-1, -1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int diff = target - arr[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }

    /* Better Approach : Sorting + Two Pointers - TC: O(N log N) * SC: O(1) (or O(N) if preserving indices)
    Input is already sorted (O(N) time) or only need true/false. */
    static int[] getTwo_Sum(int[] arr, int target){

        int n = arr.length;
        int left = 0;
        int right = n-1;

        Arrays.sort(arr); // Required if input is not guaranteed to be sorted
        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args){

        int[] arr = {2,7,11,15};
        int[] nums = {2, 6, 5, 8, 13};
        int target = 9;

        System.out.println("Brute-force Solution : ");
        int[] ans = getTwoSum(nums, 14);
        System.out.println(ans[0] + " " + ans[1]);


        System.out.println("Better Solution : ");
        int[] result = twoSum(arr,target);
        System.out.println(result[0] + " " + result[1]);

        System.out.println("Optimal Solution: ");
        int[] getResult = getTwo_Sum(nums, 14);
        System.out.println(getResult[0] + " " + getResult[1]);
    }
}
