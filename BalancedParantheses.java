package javacollectionstest;

import java.util.Scanner;
import java.util.Stack;


public class BalancedParantheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch); // adds (,{,[
            } else
                if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) { // checks if stack contains opening brackects or is empty
                    return false;
                } else {
                    char top = stack.pop(); // pop() removes and returns top element
                    if ((ch == ')' && top != '(') ||
                            (ch == ']' && top != '[') ||
                            (ch == '}' && top != '{')) {
                        return false;
                    }

                }
            }
        }
            return stack.isEmpty(); // if stack is empty -balanced


    }

    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter brackets only : ");
        String str= sc.next();

        for(char ch:str.toCharArray()) {
            if ((ch != '(' && ch != ')') &&
                    (ch != '[' && ch != ']') &&
                    (ch != '{' && ch != '}')) {
                System.out.println("Invalid input. Only Brackets are allowed ");
                return;
            }

        }

        if(isBalanced(str)){
            System.out.println("Balanced Parantheses ");
        }else {
            System.out.println("Not Balanced ");
        }
    }
}
