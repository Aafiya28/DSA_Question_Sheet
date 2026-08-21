package Binary_Search;

public class FindRotation {

    /* Find out how many times the array has been rotated */
    static int findRotation(int[] arr){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while (low < high){

            int mid = low + (high-low) / 2;

            if(arr[mid] > arr[high]){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};

        int result = findRotation(arr);

        System.out.println("No. of Rotation is array: " + result);
    }
}
