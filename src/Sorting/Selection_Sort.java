package Sorting;

public class Selection_Sort {

    static void selectionSort(int[] arr){

        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr= {13, 46, 24, 50, 20, 9};

        for(int num : arr){
            System.out.print(num + " ");
        };

        System.out.println();

        selectionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
