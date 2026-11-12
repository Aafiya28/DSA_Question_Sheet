package Practise_Set.Arrays;

import java.util.HashMap;

public class TwoSum {

    // Brute-Force (Nested Loops) O(N²) O(1)
    static int[] getTwoSum(int[] arr, int target){

        if(arr == null || arr.length < 2){
            return new int[] {-1, -1};
        }

        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    //Optimal Approach : TC: O(N) * SC: O(1);
    static int[] twoSum(int[] arr, int target){

        if(arr == null || arr.length < 2){
            return new int[] {-1, -1};
        }

        int n= arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }

            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 8, 11, 24, 13};
        int target = 19;

        int[] twoSumIndices = twoSum(arr, target);

        for (int num : twoSumIndices){
            System.out.print("Index : " + num + " ");
        }
    }
}
