package corejavapracticetest;
//class Employee {
//
//    String name = "Employee";
//
//}
//
//class Manager extends Employee {
//
//    String name = "Manager";
//
//    void printName() {
//        System.out.println(name);
//        System.out.println(super.name);
//    }
//}
//
//Answer:
//
//What will be printed? Why?//Emplyee and Manager
//
//Modify the code so that the constructor of Employee is called from Manager.

class Emp{
    String name;
    Emp(String name){
        this.name=name;
        System.out.println("Employee details printed");
    }
}
class Manager3 extends Emp{
    String name ;
    Manager3(String name,String mname){
        super(name);
        this.name=mname;
        System.out.println("Manager details are printed");
    }
    void printName(){
        System.out.println("Manager name: "+name);
        System.out.println("Employee name: "+super.name);
    }
}
public class SuperKeyword{
    static void main() {
        Manager3 m3=new Manager3("Employee","Manager");
        m3.printName();

    }
}
