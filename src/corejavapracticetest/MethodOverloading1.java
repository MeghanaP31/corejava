package corejavapracticetest;
//Create a class Calculator containing overloaded methods:
//
//add(int a, int b)
//add(double a, double b)
//add(int a, int b, int c)
//
//Call all three methods.
//
//Is this compile-time or runtime polymorphism? Why?
//compile time polymorphism
//multiple methods have same name but diff parameters. compiler calls the method based on the parameters passed in it


class Calculator{

    void add(int a,int b){
        int result=a+b;
        System.out.println(" int a + int b : "+result);
    }
    void add(double a,double b){
        double result=a+b;
        System.out.println("double a + double b: "+result);
    }
    void add(int a,int b,int c){
        int result=a+b+c;
        System.out.println("int a+ int b + int c: "+result);
    }
}
public class MethodOverloading1 {
    static void main() {
       Calculator c=new Calculator();
       c.add(10,15);
       c.add(15.4,14.3);
       c.add(13,16,10);
    }
}
