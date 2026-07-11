package Arrays;

import java.util.ArrayList;

public class ThreeSum {

    //Worked but in some cases time limit exceeded
    static int[] threeSum(int[] arr, int target){

        int n = arr.length;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        int[] ans = {i, j, k};
                        return ans;
                    }
                }
            }
        }

        int[] ans = {} ;
        return ans;
    }

    //If target  == 0
//    static List<List<Integer>> threeSumAd(int[] nums){
//
//        Arrays.sort(nums);
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        int n = nums.length;
//
//        for (int i = 0; i < n - 2; i++) {
//
//            if (i > 0 && nums[i] == nums[i - 1])
//                continue;
//
//            int left = i + 1;
//            int right = n - 1;
//
//            while (left < right) {
//
//                int sum = nums[i] + nums[left] + nums[right];
//
//                if (sum == 0) {
//
//                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
//
//                    left++;
//                    right--;
//
//                    while (left < right && nums[left] == nums[left - 1])
//                        left++;
//
//                    while (left < right && nums[right] == nums[right + 1])
//                        right--;
//
//                } else if (sum < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//
//        return ans;
//    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 4, 7, 1, 8, 5, 9};

        int target = 16;

        int[] result = threeSum(arr, target);

        for(int a : result){
            System.out.print(a + " ");
        }

        //when target == 0
    }
}
