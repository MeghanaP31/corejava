package corejavapracticetest;

import java.util.Scanner;

//Write two programs:
//
//Program A: Using while
//
//Program B: Using do-while
//
//Both should repeatedly ask the user to enter a number until the user enters:
//
//0
//
//Then explain what happens when the first input is already 0.
public class DoWhileLoops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n ;

        do{ // does not check the condition first. executes even when the 1st unput is 0
            System.out.println("Enter the number again : ");
            n=sc.nextInt();
        }while (n != 0);
        System.out.println("program ended");
    }
}
