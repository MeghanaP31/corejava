package corejavapracticetest;
//Create the following hierarchy:
//Person
//  â†“
//Employee
//  â†“
//Manager
//Where:
//Person=name,age
//Employee=employeeId ,salary
//Manager=teamSize
//Create a Manager object and demonstrate that it can access properties from all three classes.

class Person{
    String name="ramya";
    int age=23;
    void personDetails() {
       System.out.println("Person Name: "+name+" Person age: "+age);
    }
}
class Employee4 extends Person{
    int id=4256;
    double salary=20000;
    void empDetails(){
        System.out.println("Employee Id: "+id+" Employee Salary: "+salary);
    }
}
class Manager1 extends Employee4{
    int teamSize=18;
    void managerDetails(){
        System.out.println("Team Size: "+teamSize);
    }
}
public class MultilevelInheritanceEx {
    static void main() {
        Manager1 m1=new Manager1();
        m1.personDetails();
        m1.empDetails();
        m1.managerDetails();
    }
}
