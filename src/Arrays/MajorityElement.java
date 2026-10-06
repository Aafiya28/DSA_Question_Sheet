package Arrays;

import java.util.HashMap;

public class MajorityElement {

    //Brute Force Solution. TC - O(N^2) SC - O(1)
    static int majorityEle(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
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

    //Better Solution. TC  -
    static int majorityElement(int[] arr){

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // To be continue --------------------
        }

        return -1;
    }

    //Optimal Solution. TC - O(N) SC - O(1)

    public static void main(String[] args) {

        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int majorityElement = majorityEle(arr);

        System.out.println("Majority Element: " + majorityElement);
    }
}
