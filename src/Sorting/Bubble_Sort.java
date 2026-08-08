package Sorting;

public class Bubble_Sort {

    static void bubbleSort(int[] arr){

        int n=arr.length;

        for(int i=0; i<n-1; i++){
            boolean swapped = false;

            for(int j=0; j<n-i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false)
                break;
        }

    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11, 5};

        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.print("Before Sorting : ");
        for(int num : nums){
            System.out.print(num + ", ");
        }
        System.out.println();

        bubbleSort(nums);

        System.out.print("After using Bubble Sort Algorithm Sorted array is: ");
        for(int num : nums){
            System.out.print(num + ", ");
        }
    }
}
