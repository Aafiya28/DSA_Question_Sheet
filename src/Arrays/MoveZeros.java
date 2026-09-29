package Arrays;
import java.util.*;

public class MoveZeros {

    /* Brute Force Solution. TC - O(2N) = O(N), SC - O(N) */
    static void moveNonZero(int[] arr){

        int n = arr.length;

        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        while (temp.size() < n){
            temp.add(0);
        }

        for(int i=0; i<n; i++){
            arr[i] = temp.get(i);
        }

    }

    /* Better Solution. TC - O(N) SC - O(1) */
    static void moveZero(int[] arr){

        int n = arr.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        while (j < n){
            arr[j++] = 0;
        }
    }

    static void moveZeros(int[] nums){

        int n = nums.length;

        int j=0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i]  = nums[j];
                nums[j++] = temp;
            }
        }
    }

    public static void main(String[] args){

        int[] arr1 = {34, 0, 64, 43, 0, 0, 25, 78};

        //Brute Force Solution TC - O(2N)= O(N), SC - O(N)
        moveNonZero(arr1);
        System.out.print("By Brute Force Solution Approach: ");
        for(int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {3, 0, 6, 0, 0, 7, 9};
        //Better Solution TC - O(N) SC - O(1)
        moveZero(arr2);
        System.out.print("By Better Solution Approach: ");
        for(int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums = {0, 1, 0, 2, 0, 3, 0, 9};
        //Optimal Solution TC - O(N), SC - O(1)
        moveZeros(nums);
        System.out.print("By Optimal Solution Approach: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
