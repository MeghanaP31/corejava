package corejavatest;
//5. Write a Student class with id and name fields. Override equals() and
//   hashCode() properly, then demonstrate that two Student objects with
//   the same id are treated as equal when added to a HashSet.

import java.util.HashSet;

public class Student {
        int id;
        String name;

        Student(int id,String name){
            this.id=id;
            this.name=name;
    }

    @Override
    public boolean equals(Object obj){

            if(this == obj){
                return true;
            }
            Student s=(Student) obj; // converting obj intlo student obj
            return id == s.id; //checks if both objcts are same

    }
    @Override
    public int hashCode(){
            return Integer.hashCode(id);

    }

    static void main() {
        Student s1=new Student(101,"Meghana");
        Student s2=new Student(102,"Sneha");

        HashSet<Student> set=new HashSet<>();
        set.add(s1);
        set.add(s2);

        for(Student s:set) {
                System.out.println(s.id + " " + s.name);

        }
        System.out.println(set.hashCode());

    }
}
