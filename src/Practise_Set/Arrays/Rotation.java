package Practise_Set.Arrays;

public class Rotation {

    static void left(int[] arr){

        int n = arr.length;

        int left = arr[0];

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = left;

    }

    static void right(int[] arr){

        int n = arr.length;

        int right = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = right;

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.print("Original Array: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        left(arr);
        System.out.print("After Left Rotation: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        int[] nums = {1, 2, 3, 4};

        System.out.print("Original Array: ");
        for(int a : nums){
            System.out.print(a + " ");
        }
        System.out.println();

        right(nums);
        System.out.print("After Right Rotation: ");
        for(int a : nums){
            System.out.print(a + " ");
        }
    }
}
