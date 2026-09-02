package corejavapracticetest;
//Find the Largest Number
//
//Given three integers:
//
//int a = 25;
//int b = 67;
//int c = 42;
//
//Write a program to find the largest number without using Math.max().
//
//Then modify your solution to handle the case where two or all three numbers are equal.
public class LargestNumber {
    static void main() {
        int a = 42;
        int b = 67;
        int c = 67;

        if(a == b && b == c ){ // check if three numbers are equal
            System.out.println("Three numbers are equal "+a);
        } else if (a == b && a > c) { //check if two nums are equal
            System.out.println("Two numbers are equal "+a +" is the Largest number");
        } else if (a == c && a > b) {
            System.out.println("Two numbers are equal "+a+" is the Largest number");
        } else if (b == c && b > a) {
            System.out.println("Two numbers are equal "+b+" is the Largest number");
        } else if( a > b && a > c){
            System.out.println(a+" is the Largest number");
        } else if (b > a && b > c) {
            System.out.println(b+" is the Largest number");
        }else {
            System.out.println(c+" is the largest number ");
        }
    }
}
