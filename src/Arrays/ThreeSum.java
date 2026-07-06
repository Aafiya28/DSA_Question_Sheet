package Arrays;

public class ThreeSum {

    static int[] threeSum(int[] arr, int target){

        int n = arr.length;

        int[] sum;
        for(int i=0; i<n; i++){
            if(arr[i] + arr[i+1] + arr[i+2] == target){
                int[] ans = {i, i+1, i+2};
                return ans;
            }
        }

        int[] ans = {} ;
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 4, 7, 1, 8, 5, 9};

        int target = 16;

        int[] result = threeSum(arr, target);

        for(int a : result){
            System.out.print(a + " ");
        }
    }
}
