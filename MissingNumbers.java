package javacollectionstest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {
    static void main() {
        List<Integer> numbers= Arrays.asList(1,2,3,4,6,7,8,9,10);
        Set<Integer> set=new HashSet<>(numbers);

        for(int i=1;i<set.size();i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }

    }
}
