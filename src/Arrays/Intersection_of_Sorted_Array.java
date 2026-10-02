package Arrays;

import java.util.*;

public class Intersection_of_Sorted_Array {

    //Brute force Solution TC - O(N*M) SC - O(M).
    static int[] interSection(int[] num1, int[] num2){

        List<Integer> list = new ArrayList<>();
        int[] visited = new int[num2.length];

        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num2.length; j++){

                if(num1[i] == num2[j] && visited[j] == 0){
                    list.add(num1[i]);
                    visited[j] = 1;
                    break;
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    //Optimal Solution (Two Pointer) TC - O(N+M) SC - O(1).
    static int[] intersection (int[] num1, int[] num2){

        int n = num1.length;
        int m = num2.length;

        List<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;

        while (i< n && j<m){
            if(num1[i] == num2[j]){
                list.add(num1[i]);
                i++;
                j++;
            }else if(num1[i] < num2[j]){
                i++;
            }else {
                j++;
            }
        }

        int[] result = new int[list.size()];

        for(int k=0; k<result.length; k++){
            result[k] = list.get(k);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,3,5};
        int[] arr2 = {2,2,3};

        System.out.print("Brute Force Solution: ");
        int[] ans = interSection(arr1, arr2);

        for(int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.print("Optimal Solution: ");
        int[] result = intersection(arr1, arr2);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
