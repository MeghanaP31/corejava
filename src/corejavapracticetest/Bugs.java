package corejavapracticetest;
//Identify and fix the problems.
//
//Then answer:
//
//Why doesn't name = name work as expected?
//Why is count declared static?
//What will count contain after creating two employees? // 2

class Employe {

    static int count; // shared by all employee objects
    String name;

    Employe(String name) {
        this.name = name;//if this keyword is not used then it thinks name as constructor parameter
        //this.name represents instance variable objects) and =name represents constructor parameter

        //counts total number of employee objects
        count++;

    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Count: " + count);
    }
}

public class Bugs {
    static void main() {
        Employe e1 = new Employe("John"); // 1 object
        Employe e2 = new Employe("David");// 2 objects

        e1.display();
        e2.display();
    }
}



