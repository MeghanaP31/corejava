package corejavapracticetest;
//Create:
//Employee and
//Manager
//Employee should contain:id,name,salary
//Manager should contain:teamSize
//Create a Manager object and print all properties.
//Requirement: Use inheritance rather than duplicating the employee fields in Manager.

class Employee3 {
    int id;
    String name;
    double salary;
    public Employee3(int id, String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
class Manager extends Employee3 {
    int teamSize;
    public Manager(int id, String name, double salary,int teamSize) {
        super(id, name, salary);
        this.teamSize=teamSize;
    }
    void details(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Manager teamsize: "+teamSize);

    }
}

public class InheritanceEx {
    static void main() {
        Manager manager=new Manager(3021,"Ashwin",40000,15);
        manager.details();

    }
}
