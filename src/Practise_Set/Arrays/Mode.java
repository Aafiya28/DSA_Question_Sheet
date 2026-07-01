package Practise_Set.Arrays;

import java.util.HashMap;

public class Mode {

    static void getMode(int[] arr){

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int a : arr){
            freq.put(a , freq.getOrDefault(a, 0) +1);
        }

        // For getting frequency of every unique key
        for(int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));
        }

        //For getting the highest frequency of key
        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int i : freq.keySet()){

        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3, 2, 8};

        getMode(arr);
    }
}
