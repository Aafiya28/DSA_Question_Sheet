package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    //Printing all Sub Sequences
    static void subSequence(int idx, List<Integer> ds, int[] arr, int n){

        if(idx >= n){
            System.out.println(ds);
            return;
        }
        ds.add(arr[idx]);
        subSequence(idx+1, ds, arr, n);

        ds.remove(ds.size()-1);
        subSequence(idx+1, ds, arr, n);
    }

    public static void main(String[] args) {

        int[] arr = {3,1,2};

        int n = arr.length;

        List<Integer> ds = new ArrayList<>();

        subSequence(0, ds, arr, n);
    }
}
