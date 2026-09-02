package corejavapracticetest;
//Create:
//
//Employee
//   â†“
//Manager
//
//Employee:
//
//calculateBonus()
//
//Manager should override calculateBonus() with different logic.
//
//Example:
//
//Employee bonus = salary * 10%
//Manager bonus = salary * 20%
//
//Create objects and demonstrate the overridden method.
class Employee5{
    double salary;
    public Employee5(double salary){
        this.salary=salary;
    }
    void calculateBonus(){
        double bonus=0.5*salary;
        System.out.println("Employee salary: "+bonus);

    }
}
class Manager2 extends Employee5{
    double salary;
    public Manager2(double Esalary,double Msalary){
        super(Esalary);
        this.salary=Msalary;

    }
    @Override
    void calculateBonus(){
        double bonus=10*salary;
        System.out.println("Manager Bonus: "+bonus);
        System.out.println("Employee Bonus: "+super.salary);
    }
}
public class MethodOverriding1 {
    static void main() {
        Employee5 e5=new Employee5(40000);
        Manager2 m2=new Manager2(30000,50000);
        m2.calculateBonus();
        e5.calculateBonus();
    }
}
