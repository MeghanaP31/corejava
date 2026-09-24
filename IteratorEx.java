package corejavatest;
//10. Write code that throws ConcurrentModificationException while removing
//    elements from a List during iteration, then rewrite it correctly
//    using an Iterator and remove().

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    static void main() {
        List<String> list= new ArrayList<>();
        list.add("sneha");
        list.add("Anu");
        list.add("laya");

        Iterator iterator =list.iterator();
        while (iterator.hasNext()) {
            String n = iterator.next().toString();
            if(n.equalsIgnoreCase("sneha")) //handles exception
            iterator.remove();//throws an exception
        }
        System.out.println(list);


    }
}
