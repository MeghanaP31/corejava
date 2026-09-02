package corejavapracticetest;
class Employee6{
    int id;
    String name;
    double salary;
    static String company="Tehouts";
    Employee6(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void calculateBonus(){
        double bonus=salary / 5;
        System.out.println("id: "+id+" name: "+name+" salary: "+salary+" company: "+company);
        System.out.println("Employee bonus: "+bonus);

    }
}
class Manager5 extends Employee6{
    double salary;
    Manager5(int id,String name,double esalary,double mSalary){
        super(id, name, esalary);
        this.salary=mSalary;
    }
    @Override
    void calculateBonus(){
        double bonus=salary / 20;
        System.out.println("id: "+id+" name: "+name+" salary: "+salary+" company: "+company);
        System.out.println("Manager bonus: "+bonus);

    }

}
class Developer extends Employee6{
    double salary;
    Developer(int id,String name,double eSalary,double dSalary){
        super(id,name,eSalary);
        this.salary=dSalary;

    }
@Override
    void calculateBonus(){
    double bonus=salary / 15;
    System.out.println("id: "+id+" name: "+name+" salary: "+salary+" company: "+company);
    System.out.println("Developer bonus: "+bonus);
}
}
public class FinalIntegratedChallenge {
    static void main() {
        Employee6 e6=new Employee6(304,"aravind",30000);
        Employee6 m5=new Manager5(204,"anu",30000,40000);
        Employee6 d=new Developer(406,"satya",40000,60000);

        e6.calculateBonus();
        m5.calculateBonus();
        d.calculateBonus();
    }
}
