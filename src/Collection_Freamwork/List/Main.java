package Collection_Freamwork.List;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List & Collection are **Interface**

        //ArrayList is a Concrete Class

        //Can create ArrayList by using Reference - ArrayList OR
        ArrayList<Integer> arrayList = new ArrayList<>();

        //By using Reference - List OR
        List<Integer> list = new ArrayList<>();

        //By using Reference - Collection
        Collection<Integer> colList = new ArrayList<>();

        //All are same just change their Reference


        //Using method of List
        //1. add();
        arrayList.add(12);
        arrayList.add(43);
        arrayList.add(23);
        System.out.println(arrayList);
        arrayList.add(63);
        System.out.println(arrayList);

        //2. addAll();
        colList.add(199);
        colList.add(239);

        arrayList.addAll(colList);
        System.out.println(arrayList);

        //3. remove();
        arrayList.remove(0);
        System.out.println(arrayList);

        //4. removeAll();
        arrayList.removeAll(colList);
        System.out.println(arrayList);

        //5. size();
        System.out.println("Size of colList: " +  colList.size());
        System.out.println(colList);

        //6. clear();
        colList.clear();
        System.out.println("After using clear() method Size of ColList: " + colList.size());

        //7. iterator();
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        //8. get() & set() method are only work for List or ArrayList Reference not for Collection Reference
        list.add(11);
        list.add(12);
        list.add(14);

        System.out.println(list.get(0));
        System.out.println("Before set() list : " + list);
        list.set(0, 100);
        System.out.println("After set() list : " + list);

        //9. toArray();
        Object[] arr =  list.toArray();

        for(Object obj : arr){
            System.out.println(obj);
        }

        //10. contain();
        System.out.println(list.contains(12));


        list.add(9);
        list.add(68);

        System.out.println("Entire List: " + list);

        //11. sort();
        Collections.sort(list);
        System.out.println(list);

        //clone();
        System.out.println(arrayList);
        ArrayList<Integer> newList = (ArrayList<Integer>) arrayList.clone();
        System.out.println(newList);
    }
}

