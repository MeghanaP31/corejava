package javacollectionstest;

import java.util.*;

class DuplicateEmployeeFoundException extends Exception{
    DuplicateEmployeeFoundException(String message){
        super(message);
    }
}
class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}
class EmployeeNotFoundException extends Exception{
    EmployeeNotFoundException(String message){
        super(message);
    }
}
class Employee1 {
    int id;
    String name;
    String department;
    double salary;

    Employee1(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return id+" | "+name+" | "+department+" | "+salary;
    }

}
public  class EmployeeManagementSystem {

    Map<Integer, Employee1> employees = new HashMap<>();

    //1. Add Employee
    void addEmployee(Employee1 employee) throws DuplicateEmployeeFoundException, InvalidSalaryException {
        if (employee.salary < 10000) {
            throw new InvalidSalaryException("Salary must be at least 10000");
        }
        if (employees.containsKey(employee.id)) {
            throw new DuplicateEmployeeFoundException("Employee already exists ");
        }

        System.out.println(employee);
    }//2. Find Employee

    Employee1 findEmployee(int id) throws EmployeeNotFoundException {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee doesnot exixts. ");
        }
        return employees.get(id);
    }//3. Delete Employee

    void deleteEmployee(int id) throws EmployeeNotFoundException {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee doesnot exixts ");
        }
        employees.remove(id);
        System.out.println("Employee deleted succesfully ");
    }//4. Highest Salary
    Employee1 highestPaidEmployee() throws EmployeeNotFoundException {
        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException("No employees available");
        }
        Employee1 highest = null;
        for (Employee1 employee : employees.values()) {
            if (highest == null || employee.salary > highest.salary) {
                highest = employee;
            }
        }
        return highest;
    }//5. Employees by Department
    List<Employee1> getEmployeesByDepartment(String department) {
        List<Employee1> result = new ArrayList<>();
        for (Employee1 employee : employees.values()) {
            if (employee.department.equalsIgnoreCase(department)) {
                result.add(employee);
            }
        }
        return result;
    }//6. Sort Employees
    void sortEmployee(int choice){
        List<Employee1> list=new ArrayList<>(employees.values());
        if(choice == 1){
            Collections.sort(list, new Comparator<Employee1>() {
                @Override
                public int compare(Employee1 e1, Employee1 e2) {
                    return Integer.compare(e1.id, e2.id);
                }
            });
        } else if (choice == 2) {
            Collections.sort(list, new Comparator<Employee1>() {
                @Override
                public int compare(Employee1 e1, Employee1 e2) {
                    return e1.name.compareTo(e2.name);
                }
            });
        }else if(choice == 3){
            Collections.sort(list, new Comparator<Employee1>() {
                @Override
                public int compare(Employee1 e1, Employee1 e2) {
                    return Double.compare(e1.salary, e2.salary);
                }
            });
        }else {
            System.out.println("Invalid Sorting option ");
            return;
        }
        for(Employee1 emp:list){
            System.out.println(emp);
        }
    }


    public static void main() {
        Scanner sc = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        try {
            ems.addEmployee(new Employee1(101, "Ravi", "IT", 75000));
            ems.addEmployee(new Employee1(102, "Rahul", "HR", 55000));
            ems.addEmployee(new Employee1(103, "Priya", "IT", 90000));
            ems.addEmployee(new Employee1(104, "Anjali", "Finance", 85000));
            ems.addEmployee(new Employee1(105, "Kiran", "IT", 65000));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        while (true){
            System.out.println("Employee Management System ");
            System.out.println("1.Add Employee ");
            System.out.println("2.Find Employee ");
            System.out.println("3.Delete Employee ");
            System.out.println("4.Highest Salary ");
            System.out.println("5.Employee By Department ");
            System.out.println("6.Sort Employee ");
            System.out.println("7. Exit ");

            System.out.println("Enter your choice : ");
            int choice =sc.nextInt();
            if(choice == 1){
                System.out.println("Enter Employee ID: ");
                int id=sc.nextInt();
                System.out.println("Enter Employee Name: ");
                String name=sc.next();
                System.out.println("Enter Employee Department: ");
                String dept=sc.next();
                System.out.println("Enter Employee Salary: ");
                double sal=sc.nextDouble();
                try{
                    Employee1 emp=new Employee1(id,name,dept,sal);
                    ems.addEmployee(emp);
                }catch (DuplicateEmployeeFoundException | InvalidSalaryException e){
                    System.out.println(e.getMessage());
                }
            } else if(choice == 2) {
                System.out.println("Enter Employee ID: ");
                int id=sc.nextInt();
                try{
                    Employee1 emp=ems.findEmployee(id);
                    System.out.println(emp);
                }catch (EmployeeNotFoundException e){
                    System.out.println(e.getMessage());
                }
            }else if(choice == 3) {
                System.out.println("Enter Employee ID: ");
                int id=sc.nextInt();
                try{
                    ems.deleteEmployee(id);
                   // System.out.println(emp);
                }catch (EmployeeNotFoundException e){
                    System.out.println(e.getMessage());
                }
            }else if(choice == 4) {
                try{
                    Employee1 emp=ems.highestPaidEmployee();
                    System.out.println("Highest paid employee: ");
                    System.out.println(emp);
                }catch (EmployeeNotFoundException e){
                    System.out.println(e.getMessage());
                }
            } else if (choice == 5) {
                System.out.println("enter Department: ");
                String dept=sc.next();
                List<Employee1> result=ems.getEmployeesByDepartment(dept);
                if(result.isEmpty()){
                    System.out.println("No employees found");
                }else {
                    for(Employee1 employee1:result){
                        System.out.println(employee1);
                    }
                }
            } else if (choice == 6) {
                System.out.println("1.Sort By ID: ");
                System.out.println("2.Sort By Name: ");
                System.out.println("3.Sort By Salary: ");
                System.out.println("enter Sorting choice");
                int sortChoice=sc.nextInt();
                ems.sortEmployee(sortChoice);
            } else if (choice == 7) {
                System.out.println("Thankyou ");
                break;
            }else {
                System.out.println("Invalid Choice ");
            }
        }
    }

}

