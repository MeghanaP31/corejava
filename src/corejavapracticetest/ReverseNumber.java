package corejavapracticetest;

import java.util.Scanner;

//Write a Java program to reverse an integer without converting it into a String.
//
//Example:
//
//Input: 12345
//Output: 54321
//
//Also handle:
//
//Input: 1200
//Output: 21
public class ReverseNumber {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid Input ");
            return;
        }
        int num = sc.nextInt();
        int reversed = 0;
        int temp = num;

        while (temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        System.out.println(reversed);
    }
}
