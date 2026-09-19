package javacollectionstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Why would we use Comparator when Comparable already exists?
//comparable - provides one default compareTo() method for sorting, used for natural orders
//comparator - provides multiple compare() sorting options., used for custom orders


public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return id+"  "+name+"  "+salary;
    }



    static void main() {
        ArrayList<Employee> collections=new ArrayList<>();
        collections.add(new Employee(106,"Mohan",40000));
        collections.add(new Employee(104,"Anand",60000));
        collections.add(new Employee(103,"Mahesh",55000));
        collections.add(new Employee(107,"Sai",75000));

        Collections.sort(collections,new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return Double.compare(e1.salary,e2.salary);
                    }
                });

        System.out.println("Salary in Ascending order: ");
        for(Employee e: collections){
            System.out.println(e);
        }
        Collections.sort(collections,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary,e1.salary);
            }
        });

        System.out.println("Salary in Descending order: ");
        for(Employee e: collections){
            System.out.println(e);
        }

        Collections.sort(collections,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Names in alphabetical order: ");
        for(Employee e: collections){
            System.out.println(e);
        }




    }
}
