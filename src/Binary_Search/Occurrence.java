package Binary_Search;

public class Occurrence {

    /* First and Last Occurrence */

    static int[] firstAndLast(int[] arr, int target){

        int n=arr.length;

        int first = -1;
        int last = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }

        return new int[] {first, last};
    }

    //For First&LastOcc Using Binary Search Separately finding first and last occurrence
    static int firstOccDirect(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; // keep looking on the left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccDirect(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1; // keep looking on the right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int[] firstAndLastOcc(int[] arr, int x){

        int first = firstOccDirect(arr, x);
        if(first == -1) return new int[]{-1,-1};

        int last = lastOccDirect(arr, x);

        return new int[] {first, last};
    }

    public static void main(String[] args) {

        int[] arr = {3,4,6,13,13,13,20,40};
        int target = 13;

        int[] result = firstAndLastOcc(arr, target);

        for(int num : result){
            System.out.print(num + ", ");
        }
    }
}
