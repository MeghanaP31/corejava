package javacollectionstest;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
    static void main() {
        String input="programming";
        Set< Character> set=new LinkedHashSet<>();
        for(char c: input.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            System.out.println(c);
        }

    }
}
