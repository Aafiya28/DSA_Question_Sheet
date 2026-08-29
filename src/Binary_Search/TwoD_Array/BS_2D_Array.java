package Binary_Search.TwoD_Array;

public class BS_2D_Array {

    static int getLowerBound(int[] arr, int n, int x){

        int low =0;
        int high = n-1;

        int ans = -1;

        while (low <= high){

            int mid = (low+high)/2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;
    }
}
