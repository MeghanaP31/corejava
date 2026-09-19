package javacollectionstest;

import java.util.Scanner;

class InvalidSalryException extends Exception{
    public InvalidSalryException(String message){
        super(message);
    }
}
public class CustomExceptions {
    static void main() throws InvalidSalryException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Employee Salary: ");
        double salary=sc.nextDouble();

        try{
            if(salary < 10000 || salary > 100000){
                throw new InvalidSalryException(" Salary must be between 10000 and 100000");
            }else {
                System.out.println("salary: " + salary);
            }
        }catch (InvalidSalryException e){
            System.out.println("Invalid Salary "+e.getMessage());
        }

    }
}
