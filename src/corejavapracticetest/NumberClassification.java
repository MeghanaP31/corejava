package corejavapracticetest;

import java.util.Scanner;

// Number Classification
//
//Write a program that accepts an integer and determines whether it is:
//
//Positive even
//Positive odd
//Negative even
//Negative odd
//Zero
//
//Do this using if-else.
//
//Do not use nested loops or switch.
public class NumberClassification {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();

        if(number % 2 == 0 && number > 0){
            System.out.println(number+" is positive even number");
        } else if (number % 2 != 0 && number > 0) {
            System.out.println(number+" is positive odd number");
        } else if (number % 2 ==0 && number < 0) {
            System.out.println(number+" is Negative even number");
        } else if (number % 2 != 0 && number < 0) {
            System.out.println(number+" is negative odd number");
        }else {
            System.out.println(" Number is Zero");
        }

    }
}
