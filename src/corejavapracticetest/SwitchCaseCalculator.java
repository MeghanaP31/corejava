package corejavapracticetest;
//Write a calculator using switch.
//Input: number1, number2, operator
//Supported operators: +, -, *, /, %

import java.util.Scanner;

public class SwitchCaseCalculator {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Number 2 : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter The Operator : ");
        char operator = sc.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) { // num2 should not be 0
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                } else {
                    System.out.println("Zero is not allowed");
                }break;
            default:
                System.out.println("Invalid Operator");

        }
    }
}
