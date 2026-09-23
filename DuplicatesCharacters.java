package javacollectionstest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;

public class DuplicatesCharacters {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an input: ");
        String input = sc.next().toLowerCase();
    
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
