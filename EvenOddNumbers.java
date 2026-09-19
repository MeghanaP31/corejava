package javacollectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumbers {
    static void main() {

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> evenNum=new ArrayList<>();
        ArrayList<Integer>  oddNum=new ArrayList<>();

        for(int num:numbers){
            if(num %2 ==0){
                evenNum.add(num);
            }else {
                oddNum.add(num);
            }
        }
        System.out.println("even numbers: "+evenNum);
        System.out.println("odd numbers: "+oddNum);

    }
}
