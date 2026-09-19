package javacollectionstest;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 60, 80, 30);
        int largestnum=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int num : numbers){
            if(num > largestnum){
                secondlargest=largestnum;
                largestnum=num;
            } else if (num >secondlargest && num <largestnum) {
                secondlargest=num;

            }
        }
        //System.out.println("largest number: "+largestnum);
        System.out.println("second largest number: "+secondlargest);
    }
}
