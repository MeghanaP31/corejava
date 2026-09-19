package javacollectionstest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesCharacters {
    static void main() {
        String input="programming";
        Set<Character> set=new HashSet<>();
        Set<Character> set1=new LinkedHashSet<>();

        for(char ch: input.toCharArray()){
            if(set.contains(ch)){
                set1.add(ch);//add duplicates
            }else {
                set.add(ch);
            }
        }
        for(char ch: set1)
            System.out.println(ch);

    }
}
