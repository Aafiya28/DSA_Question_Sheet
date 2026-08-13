package Binary_Search;

public class LowerBound {

    static int lbSearch(int[] arr, int target){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        int ans = n;


        while(low <= high){

            int mid = (low + high)/2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7,8,9};
        int target = 18;

        int result = lbSearch(arr, target);

        System.out.println(result);
    }
}
