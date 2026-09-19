package javacollectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove Duplicates from an ArrayList

public class RemoveDuplicates {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);
        System.out.println("Original list: "+numbers);


        ArrayList<Integer> uniquenum=new ArrayList<>();
        for(int num:numbers){
            if(!uniquenum.contains(num)){
                uniquenum.add(num);
            }
        }
        System.out.println(uniquenum);
    }
}
