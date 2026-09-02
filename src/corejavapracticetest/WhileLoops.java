package corejavapracticetest;
//Write two programs:
//Program A: Using while
//Program B: Using do-while
//Both should repeatedly ask the user to enter a number until the user enters:0
//Then explain what happens when the first input is already 0

import java.util.Scanner;

public class WhileLoops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();

        while (n != 0){ // checks the condition first. if the 1st input is 0 it stops loop
            System.out.println("Enter the number again : "); // else asks the users to input numbers again and again until 0
            n=sc.nextInt();
        }
       System.out.println("program ended");


    }
}
