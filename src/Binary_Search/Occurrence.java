package Binary_Search;

public class Occurrence {

    /* First and Last Occurrence -  Brute force solution */
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

    /* For First&LastOcc Using Binary Search Separately finding first and last occurrence - Optimal Solution */
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

    static int[] firstAndLastOcc(int[] arr, int x){

        int first = firstOccDirect(arr, x);
        if(first == -1) return new int[]{-1,-1};

        int last = lastOccDirect(arr, x);

        return new int[] {first, last};
    }

    public static void main(String[] args) {

        int[] arr = {3,4,6,13,13,13,20,40};
        int target = 13;

        int[] ans = firstAndLast(arr, target);
        System.out.print("By Using Linear Search: ");
        for(int num : ans){
            System.out.print(num + ", ");
        }
        System.out.println();

        int[] result = firstAndLastOcc(arr, target);
        System.out.print("By Using Binary Search: ");
        for(int num : result){
            System.out.print(num + ", ");
        }
    }
}
