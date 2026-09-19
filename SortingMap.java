package javacollectionstest;

import java.util.Map;
import java.util.TreeMap;

public class SortingMap {
    static void main() {
        TreeMap<Integer,String > employee =new TreeMap<>();
        employee.put(104,"Ravi");
        employee.put(101,"Rahul");
        employee.put(105,"Priya");
        employee.put(102,"Anjali");
        employee.put(103,"adithya");

        System.out.println(employee.keySet());
       /* for(Map.Entry<Integer,String> entry: employee.entrySet()) {
            System.out.println("key: " + entry.getKey() + ",      Value: " + entry.getValue());
        }*/

        }
}
