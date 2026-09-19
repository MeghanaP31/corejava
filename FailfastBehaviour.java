package javacollectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//This tests fail-fast behavior.
//generally.. fail-fast throws exception when structural modification happens while iterating.

public class FailfastBehaviour {
    static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> itr=numbers.iterator();
        while(itr.hasNext()){
            int number= itr.next();
            if(number > 30){
                itr.remove();
            }
        }
        System.out.println("After iterating : ");
        System.out.println(numbers);


    }
}
  /*for (Integer number : numbers) {
        if (number > 30) {
        numbers.remove(number);
            }
                    }
     */
//it doesnot throw exception,and only removes 40 and prints [10,20,30,50]
//becoz....when the iterator removes 40.  50 moves to index 3 and there will be no next element so it prints 50.