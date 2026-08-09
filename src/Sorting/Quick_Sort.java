package Sorting;

public class Quick_Sort {

    static int partition(int[]arr, int low, int high){

        int pivot = arr[low];
        int i=low;
        int j=high;

        while(i<j){

            while (arr[i] <= pivot && i <= high-1){
                i++;
            }

            while (arr[j] >= pivot && j >= low+1){
                j--;
            }

            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high){

        if(low < high){
            int pIdx = partition(arr, low, high);
            quickSort(arr, low, pIdx-1);
            quickSort(arr, pIdx+1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {70, 30, 50, 10};

        quickSort(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}
