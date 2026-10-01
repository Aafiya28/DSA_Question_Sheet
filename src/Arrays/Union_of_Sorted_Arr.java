package Arrays;

import java.util.*;

public class Union_of_Sorted_Arr {

    // Using ArrayList - Brute Force Solution TC - O((N+M)^2) SC - O(U log U)
    static List<Integer> unionOf2Arr(int[] num1, int[] num2){

        int n = num1.length;
        int m = num2.length;

        List<Integer> unionResult = new ArrayList<>();

        for(int num : num1){
            boolean alreadyPresent = false;

            for(int currEle : unionResult){
                if(currEle == num){
                    alreadyPresent = true;
                    break;
                }
            }

            if(!alreadyPresent){
                unionResult.add(num);
            }
        }

        for(int num : num2){
            boolean alreadyPresent = false;

            for(int currEle : unionResult){
                if(currEle == num){
                    alreadyPresent = true;
                    break;
                }
            }

            if(!alreadyPresent){
                unionResult.add(num);
            }
        }

        Collections.sort(unionResult);

        return unionResult;
    }

    // Using Set Data Structure - Better Solution TC - O((N+M) log(N+M)) SC - O(N+M).
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

    // Using Two Pointer - Optimal Solution TC - O(N+M) SC - O(1)
    static List<Integer> unionArr(int[] num1, int[] num2){

        int n = num1.length;
        int m = num2.length;

        int i=0;
        int j=0;

        List<Integer> unionResult = new ArrayList<>();

        while(i<n && j<m){

            int currentValue;

            if(num1[i] < num2[j]){
                currentValue = num1[i];
                i++;
            }else if(num1[i] > num2[j]){
                currentValue = num2[j];
                j++;
            }else {
                currentValue = num1[i];
                i++;
                j++;
            }

            if (unionResult.isEmpty() ||
                    unionResult.get(unionResult.size() - 1) != currentValue) {
                unionResult.add(currentValue);
            }
        }

        while (i < n) {
            if (unionResult.isEmpty() ||
                    unionResult.get(unionResult.size() - 1) != num1[i]) {
                unionResult.add(num1[i]);
            }

            i++;
        }

        // Process values left in the second array.
        while (j < m) {
            if (unionResult.isEmpty() ||
                    unionResult.get(unionResult.size() - 1) != num2[j]) {
                unionResult.add(num2[j]);
            }

            j++;
        }

        return unionResult;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2= {2,2,3,4,6};

        List<Integer> result = new ArrayList<>(unionArray(arr1, arr2));

        System.out.print("Brute Force Solution: ");
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();

        List<Integer> unionResult = new ArrayList<>(unionOf2Arr(arr1, arr2));

        System.out.print("Better Solution: ");
        for(int num : unionResult){
            System.out.print(num + " ");
        }
        System.out.println();

        List<Integer> unionArray = new ArrayList<>(unionArray(arr1, arr2));

        System.out.print("Optimal Solution by Two Pointer: ");
        for (int num : unionArray){
            System.out.print(num + " ");
        }
    }
}
