package Binary_Search;

public class Floor_and_Ceil {
    /*/
    * Floor and Ceil in Sorted Array
    * Problem Statement: ou're given an sorted array arr of n integers and an integer x.
    * Find the floor and ceiling of x in arr[0..n-1].
    * The floor of x is the largest element in the array which is smaller than or equal to x.
    * The ceiling of x is the smallest element in the array greater than or equal to x
    /*/
    static int[] getFloorCeil(int[] nums, int x){

        int[] result = new int[2];

        result[0] = getFloor(nums, x);
        result[1] = getCeil(nums, x);

        return result;
    }

    /* Get Floor */
    static int getFloor(int[] nums, int x){

        int n = nums.length;

        int low=0;
        int high=n-1;

        int floor = -1;

        while (low <= high){
            int mid = (low+high)/2;

            if(nums[mid] <= x){
                floor = nums[mid];
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return floor;
    }

    /* Get Ceil */
    static int getCeil(int[] nums, int x){

        int n = nums.length;

        int low = 0;
        int high = n-1;

        int ceil = -1;

        while (low <= high){

            int mid = (low+high)/2;

            if(nums[mid] >= x){
                ceil = nums[mid];
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;

        int[] result = getFloorCeil(nums, x);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
