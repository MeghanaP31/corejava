package javacollectionstest;

import java.util.*;

//Which preserves insertion order? // LinkedhashMap preserves insertion order
//Which sorts by key? // Tree map sorts by key
//Which provides no ordering guarantee? // Hash map has no guarantee order

public class MapTypes {
    static void main() {
        HashMap<Integer,String > hashMap=new HashMap<>();
        hashMap.put(103,"C");
        hashMap.put(101,"A");
        hashMap.put(105,"E");
        hashMap.put(102,"B");
        hashMap.put(104,"D");

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(103,"C");
        linkedHashMap.put(101,"A");
        linkedHashMap.put(105,"E");
        linkedHashMap.put(102,"B");
        linkedHashMap.put(104,"D");

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(103,"C");
        treeMap.put(101,"A");
        treeMap.put(105,"E");
        treeMap.put(102,"B");
        treeMap.put(104,"D");

        System.out.println("HashMap : "+hashMap);
        System.out.println("LinkedHashMap: "+linkedHashMap);
        System.out.println("TreeMap: "+treeMap);


    }
}
