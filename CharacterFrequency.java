package javacollectionstest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an input: ");
        String input = sc.next().toLowerCase();
        
        Map<Character,Integer> hm=new HashMap<>();
        
        for(char ch: input.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1); // if the char already exists,it increments by 1
        }
        System.out.println(hm);
    }
}
