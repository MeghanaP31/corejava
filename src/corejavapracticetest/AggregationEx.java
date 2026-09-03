package corejavapracticetest;
//Create employees separately and then add them to the department.
//
// Why is this aggregation rather than composition?//
//Aggregation is weak association
//this is aggergation because if dept is deleted,employees still exist
//but if there are no employees then no dept.


class Employee7{
    String name;

    Employee7(String name){
        this.name=name;
    }
    void empName(){
        System.out.println("Employee Name: "+name);
    }
}
class Department{
    String dept;
    Employee7 employee;

    Department(String dept,Employee7 employee){
        this.dept=dept;
        this.employee=employee;
    }
    void addEmployees(Employee7 employee){// aggregation( even if dept doesn't exist,employees exists.)
        System.out.println("Department: "+dept);
        employee.empName();

    }
}
public class AggregationEx {
    static void main() {
        Employee7 e7=new Employee7("venu");
        Department d=new Department("IT",e7);
        d.addEmployees(e7);


    }

}
