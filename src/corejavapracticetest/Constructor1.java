package corejavapracticetest;
//Create an Employee class with:
//id, name, salary
//Create:
//A no-argument constructor
//A parameterized constructor
//Create objects using both constructors and print their details.
//Explain why constructors do not have a return type.=
//they used to initialize values and allocate memory

class Employee1{
    int id;
    String name;
    double salary;

    public Employee1(){
        System.out.println("No-Arguments constructor is called");
    }
    public Employee1(int id,String name,double salary){
        System.out.println("Parameterized Constructor is called");
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }

}
public class Constructor1 {
    static void main() {
        Employee1 e=new Employee1();
        Employee1 e1=new Employee1(103,"Manusha",45000);
        e1.displayDetails();
    }
}
