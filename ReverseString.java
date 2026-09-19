package javacollectionstest;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.next();

        Stack<Character> stack=new Stack<>();
        for(char ch: input.toCharArray()){
            stack.push(ch);

            }
        System.out.println("Reversed String : ");

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }


}

