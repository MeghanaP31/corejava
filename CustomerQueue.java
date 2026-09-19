package javacollectionstest;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    static void main() {
        Queue<String > queue=new LinkedList<>();
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        queue.add("Customer 4");

        while (!queue.isEmpty()){
            String customer= queue.poll();//poll remove and return 1st element
            System.out.println("Processing "+customer);
        }

    }
}
