package javacollectionstest;
import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees> {

    int id;
    String name;
    double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return id+"  "+name+"  "+salary;
    }

    @Override
    public int compareTo(Employees other) {
        return this.id - other.id; //compare 1st ID with 2nd ID
    }


    static void main() {
        ArrayList<Employees> collections=new ArrayList<>();
        collections.add(new Employees(106,"Mohan",40000));
        collections.add(new Employees(104,"Anand",60000));
        collections.add(new Employees(103,"Mahesh",55000));
        collections.add(new Employees(107,"Sai",75000));

        System.out.println("Before sorting: ");
        for(Employees e: collections){
            System.out.println(e);
        }
        Collections.sort(collections);
        System.out.println("After sorting: ");
        for(Employees e: collections){
            System.out.println(e);
        }




    }
}