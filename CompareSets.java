package javacollectionstest;

import java.util.*;

public class CompareSets {
    static void main() {
        List<Integer> arr=Arrays.asList(50,10,40,20,30);
        HashSet<Integer> hs=new HashSet<>(arr);
        LinkedHashSet<Integer> ls=new LinkedHashSet<>(arr);
        TreeSet<Integer> ts=new TreeSet<>(arr);

        System.out.println("Hash set: ");
        for(int set:hs){
            System.out.print(set+" "); // random access
        }
        System.out.println();
        System.out.println("Linked Hash set: ");
        for(int set:ls){
            System.out.print(set+" "); // insertion order
        }
        System.out.println();
        System.out.println("Tree Set: ");
        for(int set:ts){
            System.out.print(set+" "); // sorted order
        }
    }
}
