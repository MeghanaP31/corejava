package javacollectionstest;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    static void main() {
        String input = "banana";
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch: input.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.println(hm);
    }
}
