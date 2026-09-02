package corejavapracticetest;
//class Employee {
//    int employeeId;
//    String name;
//    static String company = "ABC";
//}
//Create three employees.
//Change the company name through one employee/object.
//Then print the company name using all three objects. // all objects company name changes to changed value

//Question: What will be printed and why?
//chnaged company name will be printed. static data is shared by all . static doesnot belong to objects it belongs to class
//Is company stored separately for every object? Explain.
//no. static variables are stored in method aread ,shared memory

class Employee2{
    static String company="AMAZON";
    int id;
    String name;
     void employee1(){
         id=201;
         name="Charan";
     }
    void employee2(){
        id=202;
        name="Abhishek";
    }
    void employee3(){
        id=203;
        name="Apoorva";
    }

}
public class StaticKeyword {
    static void main() {
        Employee2 e1=new Employee2();
        Employee2 e2=new Employee2();
        Employee2 e3=new Employee2();
        e1.employee1();
        e2.employee2();
        e3.employee3();
        e1.company="Google";

        System.out.println("Employee1 ID: "+e1.id+", Employee1 Name: "+e1.name+", Employee1 Company: "+e1.company);
        System.out.println("Employee2 ID: "+e2.id+", Employee2 Name: "+e2.name+", Employee2 Company: "+e2.company);
        System.out.println("Employee3 ID: "+e3.id+", Employee3 Name: "+e3.name+", Employee3 Company: "+e3.company);


    }
}
