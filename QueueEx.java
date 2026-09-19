package javacollectionstest;

import java.util.LinkedList;
import java.util.Queue;


//peek() - returns 1st element without removing it
//          returns 'null' if it is empty
//poll() - removes and returns 1st element
//         returns ' null' if it is empty
//remove()- removes 1st element
//          throws 'NoSuchElementException' if it is empty

public class QueueEx {
    static void main() {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(413);
        queue.add(531);
        queue.add(876);
        queue.add(654);

        System.out.println(queue);
        queue.peek();
        System.out.println("peek() method: "+queue);// 1st element but doesnot remove it
        queue.poll();
        System.out.println("poll() method: "+queue);//removes 1st elements
        queue.remove();
        System.out.println("remove() method: "+queue);//removes 1st element


    }
}
