package Binary_Search;

public class FindMin {

    /* LeetCode : 153. Find Minimum in Rotated Sorted Array*/
    static int findMin(int[] nums){

        int n = nums.length;

        int low = 0;
        int high = n-1;

        while (low < high){

            int mid = low + (high-low) / 2;

            if(nums[mid] > nums[high]){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};
        int[] nums = {11,13,15,17};

        int ans = findMin(nums);

        System.out.println(ans);
    }
}
