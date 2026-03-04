package Arrays;

import java.util.ArrayList;

public class RemoveDublicate {

    static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        if(n == 0) return result;
        result.add(arr[0]);

        for(int i=1; i<n; i++){
            if(arr[i-1] != arr[i]){
                result.add(arr[i]);
            }
        }

        return result;
    }

    static int remDups(int arr[], int n)
    {
        int res = 1;

        for(int i = 1; i < n; i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 30, 30, 30};
        int n = 6;

        System.out.println("Before Removal");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        n = remDups(arr, n);
        System.out.println("After Removal");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] arr2 = {2,2,2,2};

        ArrayList<Integer> result  = removeDuplicates(arr);
        System.out.println(result);
    }
}
