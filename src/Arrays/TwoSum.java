package Arrays;

import java.util.HashMap;

public class TwoSum {

    //Brute-force Approach - TC: O(N^2) * SC: O(1).
    static int[] getTwoSum(int[] arr, int target){

        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){

                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    //Optimal Approach - TC: O(N) * SC: O(1).
    static int[] twoSum(int[] arr, int target){

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

    public static void main(String[] args){

        int[] arr = {2,7,11,15};
        int[] nums = {2, 6, 5, 8, 13};
        int target = 9;

        System.out.println("Brute-force Solution : ");
        int[] ans = getTwoSum(nums, 14);
        System.out.println(ans[0] + " " + ans[1]);


        System.out.println("Optimal Solution : ");
        int[] result = twoSum(arr,target);
        System.out.println(result[0] + " " + result[1]);


    }
}
