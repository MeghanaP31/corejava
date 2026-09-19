package javacollectionstest;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryMap {
    static void main() {
        Map<Integer,Double> employee =new HashMap<>();
        employee.put(101,50000.0);
        employee.put(102,70000.0);
        employee.put(103,45000.0);
        employee.put(104,90000.0);

        double highestSalary=Double.MIN_VALUE;
        double lowestSalary=Double.MAX_VALUE;
        double totalSalary=0;
        double averageSalary=0;


        for(Map.Entry<Integer,Double> entry: employee.entrySet()) {
            int employeeId = entry.getKey();
            double salary = entry.getValue();

            if (salary > highestSalary) {
                highestSalary = salary;
            }
            if (salary < lowestSalary) {
                lowestSalary = salary;
            }

            totalSalary += salary;
            averageSalary = totalSalary / employee.size();

        }
            System.out.println("Highest salary: "+highestSalary);
            System.out.println("Lowest salary: "+lowestSalary);
            System.out.println(("Average salary: "+averageSalary));
            System.out.println();
            System.out.println("Employees earning more than 60000 ");

            for(Map.Entry<Integer,Double> entry : employee.entrySet()){
                if (entry.getValue() > 60000) {
                    System.out.println("Employee ID: "+entry.getKey()+"     Employee Salary: "+entry.getValue());
                }
            }


    }
}
