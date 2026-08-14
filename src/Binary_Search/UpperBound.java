package Binary_Search;

public class UpperBound {

    static int ubSearch(int[] arr, int x ){

        int n=arr.length;

        int low=0;
        int high=n-1;

        int ans=0;

        while (low <= high){

            int mid = (low + high)/2;

            if(arr[mid] > x){
                ans=mid;
                high=mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,6,7,8,9,11,11,11,12};

        int x = 11;

        int ans = ubSearch(arr,x);

        System.out.println(ans);
    }
}
