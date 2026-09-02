package corejavapracticetest;
//Print numbers from 1 to 100.
//
//Rules:
//
//Divisible by both 3 and 5 â†’ FizzBuzz
//Divisible only by 3 â†’ Fizz
//Divisible only by 5 â†’ Buzz
//Otherwise â†’ number itself

public class FizzBuzz {
    static void main() {
        for(int i=1;i<=100;i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }else{
                System.out.println(i+" ");
            }
        }
    }
}
