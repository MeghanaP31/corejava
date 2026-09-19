package javacollectionstest;

import java.util.*;

public class SortingMapValue {
    static void main() {
        Map<Integer, Double> employee = new HashMap<>();
        employee.put(101, 50000.0);
        employee.put(102, 90000.0);
        employee.put(103, 40000.0);
        employee.put(104, 70000.0);

        List<Map.Entry<Integer,Double>> list=new ArrayList<>(employee.entrySet());//convert map to list
        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,Double> entry:list){
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
    }
}
