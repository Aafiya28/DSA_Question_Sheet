package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,2,3,1,3,3,2,5,4,34,23,12,1,2,4,3,5};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }

        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

    }
}
