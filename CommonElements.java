package javacollectionstest;

import java.util.Arrays;
import java.util.List;

public class CommonElements {
    static void main() {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        for(int num: list1){
            if(list2.contains(num)){
                System.out.println(num);
            }
        }

    }
}
