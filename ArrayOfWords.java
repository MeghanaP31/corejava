package corejavatest;
//2. Write a program that takes an array of words and returns a HashMap
//   with each word as the key and its frequency of occurrence as the value.

import java.util.*;

public class ArrayOfWords {
    static void main() {

        String[] arr={"apple","banana","mango","apple"};
        HashMap<String ,Integer> map=new HashMap<>();

        for(String word : arr){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else {
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
