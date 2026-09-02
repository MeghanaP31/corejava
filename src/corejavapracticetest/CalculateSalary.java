package corejavapracticetest;
//Salary Calculation
//Write a program that accepts:
//Basic Salary
//HRA
//DA
//Tax Percentage
//Calculate:
//Gross Salary = Basic + HRA + DA
//Tax Amount = Gross Salary * Tax / 100
//Net Salary = Gross Salary - Tax Amount
//Print all three values.

public class CalculateSalary {
    static void main() {
        double basicSalary = 30000;
        double hra = 30;
        double da= 40;
        double tax = 5;

        double grossSalary= basicSalary + hra + da;
        double taxAmount = grossSalary * tax / 100;
        double netSalary = grossSalary - taxAmount;

        System.out.println("Basic salary : "+basicSalary);
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("Tax % : "+tax);
        System.out.println("Gross Salary : "+grossSalary);
        System.out.println("Tax Amount : "+taxAmount);
        System.out.println("Net Salary : "+netSalary);

    }
}
