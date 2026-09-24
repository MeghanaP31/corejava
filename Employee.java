package corejavatest;
//6. Write an Employee class with name and salary. Implement Comparable to
//   sort by name naturally, and write a separate Comparator to sort by
//   salary. Demonstrate both using Collections.sort().

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return name+" "+salary;
    }
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    static void main() {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Anusha",50000));
        emp.add(new Employee("Madhavi",40000));
        emp.add(new Employee("Sneha",25000));
        emp.add(new Employee("Amulya",35000));

        System.out.println("Sorting names using Comparable");
        Collections.sort(emp);
        for(Employee e : emp){
            System.out.println(e);
        }

        Comparator<Employee> comp=new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary,e2.salary);
            }
        };
        System.out.println();
        System.out.println("Sorting names using Comparator");
        Collections.sort(emp,comp);
        for(Employee e : emp){
            System.out.println(e);
        }



    }
}

