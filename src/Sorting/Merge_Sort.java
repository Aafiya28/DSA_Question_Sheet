package Sorting;

import java.util.ArrayList;

public class Merge_Sort {

    static void merge(int[] arr, int low, int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (low <= mid && right <= high){

            //merge both sorted array
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid){
            temp.add(arr[left++]);
        }

        while (right <= high){
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

    }


    static void mergeSort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int mid = (low+high)/2;

        //sorted left half
        mergeSort(arr, low, mid);

        //sorted right half
        mergeSort(arr, mid+1, high);

        //merge both half
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {

        int[] arr = {70, 30, 50, 10};

        mergeSort(arr,0, arr.length-1);

        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}
