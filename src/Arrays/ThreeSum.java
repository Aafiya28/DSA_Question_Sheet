package Arrays;

public class ThreeSum {

    static int[] threeSum(int[] arr, int target){

        int n = arr.length;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        int[] ans = {i, j, k};
                        return ans;
                    }
                }
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
