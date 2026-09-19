package javacollectionstest;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class EmployeeNameLookUp {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Map<Integer,String > employee =new HashMap<>();
        employee.put(101,"Ravi");
        employee.put(102,"Rahul");
        employee.put(103,"Priya");
        employee.put(104,"Anjali");

        try {
            System.out.println("Enter employee ID: ");
            int id = sc.nextInt();

            if (employee.containsKey(id)) {
                System.out.println("Employee Name: " + employee.get(id));
            } else {
                System.out.println("Employee not found ");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input. please enter a integer");
        }

    }
}
