package corejavatest;
//8. Implement the classic Producer-Consumer problem using wait()/notify()
//   (or BlockingQueue) with a shared buffer of fixed size.

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer{
    Queue<Integer> queue = new LinkedList<>();
    int capacity=3;

    public synchronized void  produce(int value)throws InterruptedException{
        while (queue.size() == capacity){
            wait(); // if buffer is full ,producer waits
        }
        queue.add(value); //adds items to buffer
        System.out.println("produced: "+value);
        notify();
    }
    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()){
            wait();//if buffer is empty ,consumer waits
        }
        int value=queue.remove();//removes items from buffer
        System.out.println("Consumed: "+value);
        notify();
    }
}
public class ProducerConsumer{
    static void main() {
        SharedBuffer buffer=new SharedBuffer();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try{
                    buffer.produce(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try{
                    buffer.consume();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();

    }

}
