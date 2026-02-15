package Searching;

import java.util.ArrayList;

public class Median {

    //finding median of two array

    static int medianOfArr(int[] arr,  int[] arr2){

        int n = arr.length;
        int m = arr2.length;

        ArrayList<Integer> finalArr = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i] <= arr[j]){
                    finalArr.add(arr[i]);
                }else {
                    finalArr.add(arr2[j]);
                }
            }
        }

        System.out.println(finalArr);

        int count = n+m;
        int med = 0;

        if(count%2 == 0){
            med = ((count/2)+(count/2 +1))/2;
        }else
            med = count/2;
        return -1;
    }
}
