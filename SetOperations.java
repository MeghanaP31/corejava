package javacollectionstest;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    static void main() {
        Set<Integer> a=new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        Set<Integer> b=new HashSet<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        Set<Integer> union=new HashSet<>(a);
        union.addAll(b);
        Set<Integer> intersection =new HashSet<>(a);
        intersection.retainAll(b);


        System.out.println("Set A: "+a);
        System.out.println("Set B: "+b);
        System.out.println("union: "+union);
        System.out.println("intersection: "+intersection);





    }
}
