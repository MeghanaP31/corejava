package corejavatest;
//12. Given a List<Employee>, write Stream API code to: (a) filter employees
//    with salary > 50000, (b) group them by department using
//    Collectors.groupingBy, and (c) find the average salary per department.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
    double salary;
    String dept;

    Employee1(double salary,String dept){
        this.salary=salary;
        this.dept=dept;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
    @Override
    public String toString(){
        return "salary: "+salary+"   dept: "+dept;
    }
}
public class StreamAPIEx {
    static void main() {
        List<Employee1> emp = Arrays.asList(
                new Employee1(50000, "IT"),
                new Employee1(40000, "Finance"),
                new Employee1(55000, "Testing"),
                new Employee1(65000, "IT"));

        System.out.println("Employees above 50000:");
        List<Employee1> sal = emp.stream().filter(e -> e.getSalary() >= 50000).collect(Collectors.toList());
        for (Employee1 e : sal) {
            System.out.println(e.salary);
        }
        //b. group them by dept
        System.out.println("Employees per dept");
        Map<String, List<Employee1>> dep = sal.stream().collect(Collectors.groupingBy(e -> e.getDept()));
        dep.forEach((dept, list) -> {
            System.out.println(dept + " : " + list.size() + " employees");
        });

        // average salary per dept
        System.out.println("Employees per dept avg sal");
        Map<String,Double> avg = sal.stream().collect(Collectors.groupingBy( e -> e.dept, Collectors.averagingDouble(e -> e.salary) ));

        avg.forEach((dept, average) -> {
            System.out.println(dept + " "+average);
        });
    }
    }





