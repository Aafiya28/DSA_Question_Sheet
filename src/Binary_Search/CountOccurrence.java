package Binary_Search;

public class CountOccurrence {

    static int firstOccDirect(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int first = -1;

        while(low <= high){

            int mid = low + (high-low) / 2;

            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }else if(arr[mid] > target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return first;
    }

    static int lastOccDirect(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high){
            int mid = low + (high-low) / 2;

            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }else if(arr[mid] < target) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return last;
    }

    static int count_Occ(int[] arr, int x){

        int first = firstOccDirect(arr, x);
        if(first == -1) return -1;

        int last = lastOccDirect(arr, x);

        return last - first +1;
    }


    public static void main(String[] args) {

        int[] arr = {2,3,6,13,13,13,16,17};

        int target = 13;

        int ans = count_Occ(arr, target);
        System.out.println(ans);
    }
}
