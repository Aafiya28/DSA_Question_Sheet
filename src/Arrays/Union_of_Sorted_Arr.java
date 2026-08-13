package Arrays;

import java.util.*;

public class Union_of_Sorted_Arr {

    //Union of Two Sorted Array

    static List<Integer> unionArray(int[] arr1, int[] arr2){

        int n=arr1.length;
        int m = arr2.length;
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<n; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<m; i++){
            set.add(arr2[i]);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2= {2,2,3,4,6};

        List<Integer> result = new ArrayList<>(unionArray(arr1, arr2));

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
