package javacollectionstest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    static void main() {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter 1st number: ");
            int num1=sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int num2=sc.nextInt();

            int result = num1 / num2;
            System.out.println("result: " + result);

        }catch (ArithmeticException ae){
            System.out.println("Cannot divide by zero ");

        }catch (InputMismatchException ie){
            System.out.println("please enter a valid number");
        }
    }
}
