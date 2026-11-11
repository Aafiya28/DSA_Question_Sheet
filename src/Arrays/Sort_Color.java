package Arrays;

import java.util.*;
public class Sort_Color {

    //Brute-force Approach - TC: O(NlogN) * SC: O(N)
    static void getSort(int[] arr){
        Arrays.sort(arr);
    }

    //Better Approach - TC: O(2N) → O(N) * SC: O(1)
    static void getSortColor(int[] arr){

        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        int countZeros = 0;
        int countOnce = 0;
        int countTwos = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                countZeros++;
            } else if (arr[i] == 1) {
                countOnce++;
            }else {
                countTwos++;
            }
        }

        // Second pass: Overwrite the array in sorted order
        int idx = 0;

        for(int i=0; i<countZeros; i++){
            arr[idx++] = 0;
        }

        for(int i=0; i<countOnce; i++){
            arr[idx++] = 1;
        }

        for(int i=0; i<countTwos; i++){
            arr[idx++] = 2;
        }
    }

    //Optimal Solution - TC: O(N) * SC: O(1).
    static void sortColor(int[] arr){

        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high){

            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        sortColor(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
