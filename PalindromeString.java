package corejavatest;
//1. Write a Java program to check if a given string is a palindrome,
//   without using any built-in reverse methods.

import java.util.Scanner;

public class PalindromeString {
        static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();

        String rev="";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
}
