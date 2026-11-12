package Arrays;

import java.util.HashMap;

public class MajorityElement {

    //Brute Force Solution. TC - O(N^2) * SC - O(1)
    static int majorityEle(int[] arr){

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int n = arr.length;

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }

        return -1;
    }

    //Better Solution. TC  - O(N) * SC: O(N), In the worst case, this is O(n) auxiliary space.
    static int majorityElement(int[] arr){

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int value : arr){
            int updatedFreq = map.getOrDefault(value, 0) + 1;
            map.put(value, updatedFreq);

            if(updatedFreq > n/2){
                return value;
            }
        }

        return -1;
    }

    //Optimal Solution. TC - O(N) * SC - O(1)
    static int majorityElementOp(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int candidate = 0;
        int balance = 0;

        for (int value : nums) {
            if (balance == 0) {
                candidate = value;
            }

            if (value == candidate) {
                balance++;
            } else {
                balance--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {

        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int majorityElement = majorityEle(arr);

        System.out.println("Majority Element: " + majorityElement);

        int majorityFrequencyEle = majorityElement(arr);

        System.out.println("Majority Frequency Element : " + majorityFrequencyEle);

        int majorityEle = majorityElementOp(arr);

        System.out.println("Majority Frequency Element : " + majorityEle );

    }
}
