package Hashing;

import java.util.*;
import java.util.HashMap;

public class Basic {

    public static void main(String[] args) {

        /* HashSet Data Structure - Doesn't contain duplicate only contain */
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size : 3 (because set doesn't contain duplicate ) Set : 1, 2, 3
        System.out.println("Size : " + set.size());

        for(int num : set){
            System.out.print(num + ", ");
        }

        System.out.println();

        Iterator it = set.iterator();

        System.out.println("By using Set Iterator Traversing set item : ");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        if (!set.contains(6)) {
            System.out.println("does not contain");
        }

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("dose not contain");
        }

        /* ##################################### */

        /* HashMap Data Structure - Contains data into key-value pair & Its Un-Order */
        HashMap<String, Integer> map = new HashMap<>();


        //Insert
        map.put("India", 120);
        map.put("China", 159);
        map.put("Iran", 170);

        //Print
        System.out.println(map);
        map.put("India", 133);

        System.out.println(map);

        //Search - Can use containsKey or get
        if(map.containsKey("China")){
            System.out.println("Key present in the map");
        }else {
            System.out.println("Key not present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Japan"));

        //Travers HashMap by using EntrySet for loop
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Another way to traver map and print
        System.out.println("Another way to travers map and print");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        /* ##################################### */

        /* HashTree - */

    }

}
