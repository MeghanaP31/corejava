package corejavapracticetest;
//Write a program to check whether a given number is prime.

import java.util.Scanner;

public class PrimeNum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int count = 0;//factors
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;  //count the factors
                break;
            }
        }
        if (count == 0) {// no factors =prime
            System.out.println(n + " is  prime number");
        } else {
            System.out.println(n + " is not prime number");
        }

    }
}
