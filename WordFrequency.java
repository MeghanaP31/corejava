package javacollectionstest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    static void main() {
        String str="java is easy and java Is powerful";

        HashMap<String,Integer> count=new LinkedHashMap<>();
        String[] words=str.toLowerCase().split(" ");

       for(String word : words){
            if(!word.isEmpty()){
                count.put(word,count.getOrDefault(word,0)+1);
            }
        }
        System.out.println("word frequencies: ");
        for(Map.Entry<String,Integer> entry:count.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
