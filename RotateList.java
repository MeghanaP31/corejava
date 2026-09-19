package javacollectionstest;

import java.util.Arrays;
import java.util.List;

public class RotateList {
    static void main() {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int p=2;
        for(int r=0;r<p;r++) {
            int last = list.get(list.size() - 1);

            for (int i = list.size() - 1; i > 0; i--) {
                list.set(i, list.get(i - 1));
            }
            list.set(0, last);
        }
            System.out.println(list);


    }
}
