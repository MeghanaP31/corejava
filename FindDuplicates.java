package javacollectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20,10, 40, 10, 50, 30);
        System.out.println("Original list: "+numbers);

        ArrayList<Integer> duplicate=new ArrayList<>();
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i).equals(numbers.get(j)) ){
                    if(!duplicate.contains(numbers.get(i))) {
                         duplicate.add(numbers.get(i));
                    }
                    break;
                }
            }
        }
        System.out.println("duplicate list: "+duplicate);



    }
}
