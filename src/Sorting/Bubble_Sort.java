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

    static void recursiveBubbleSort(int[] arr, int low, int high){

        if(high == 0) return;

        if (low < high){

            if(arr[low] > arr[low+1]){
                int temp = arr[low];
                arr[low] = arr[low+1];
                arr[low+1] = temp;
            }
            recursiveBubbleSort(arr, low+1, high);
        }else {
            recursiveBubbleSort(arr, 0, high-1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.print("Before Sorting : ");
        for(int num : nums){
            System.out.print(num + ", ");
        }
        System.out.println();

        //Bubble Sort Method
        bubbleSort(nums);
        System.out.print("After using Bubble Sort Algorithm Sorted array is: ");
        for(int num : nums){
            System.out.print(num + ", ");
        }
        System.out.println();

        System.out.println();

        int[] arr = {64, 25, 12, 22, 11, 5};

        for(int num : arr){
            System.out.print(num + ", ");
        };
        System.out.println();

        //Recursive Bubble Sort Method
        recursiveBubbleSort(arr, 0, arr.length-1);
        System.out.print("Using Recursive Bubble Sort Method to Sort Array: ");
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}
