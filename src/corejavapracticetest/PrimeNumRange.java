package corejavapracticetest;

import java.util.Scanner;

//Write a program to print all prime numbers between:
//Additional requirement: The program should work for any user-provided range

public class PrimeNumRange {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int n = sc.nextInt();
        System.out.println("Enter second number : ");
        int N = sc.nextInt();


        for (int i = n; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int p) {
        if (p <= 1) { // 0,1 are not allowed
            return false;
        }
        if(p == 2){ // 2 is prime
            return true;
        }
        if(p % 2==0){ // div by 2 is not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) { // checks the number until their sqrt
            if (p % i == 0) {  //num div by i is false
                return false;
            }
        }
        return true; // prints prime numbers

    }
}

