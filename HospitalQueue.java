package javacollectionstest;

import java.util.PriorityQueue;


class Patient implements Comparable<Patient> {
    String name;
    int priority;

    Patient(String  name,int priority){
        this.name=name;
        this.priority=priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority,other.priority);
    }
}
public class HospitalQueue{
    static void main() {
        PriorityQueue<Patient> patients=new PriorityQueue<>();
        patients.offer(new Patient("Ravi", 3));
        patients.offer(new Patient("Rahul", 1));
        patients.offer(new Patient("Priya", 2));
        patients.offer(new Patient("Anjali", 1));

        while (!patients.isEmpty()){
            Patient patient=patients.poll();
            System.out.println(patient.name);
        }


    }
}
