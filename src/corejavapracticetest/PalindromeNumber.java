package corejavapracticetest;
//Write a program to determine whether a number is a palindrome.


import java.util.Scanner;

public class PalindromeNumber {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if(num == rev){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }

    }

}
