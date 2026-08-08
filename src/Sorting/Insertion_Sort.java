package Sorting;

public class Insertion_Sort {

    static void insertionSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){

             int j=i;
             while (j > 0 && arr[j-1] > arr[j]){
                 int temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;

                 j--;
             }
        }
    }

    public static void main(String[] args) {

        int[] arr = {23, 1, 10, 5, 2};

        for(int num : arr){
            System.out.print(num + ", ");
        }

        System.out.println();

        insertionSort(arr);

        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}
