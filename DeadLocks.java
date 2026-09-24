package corejavatest;
//9. Write a program with two threads that lock two Object locks in
//   opposite order, causing a deadlock. Add print statements to show the
//   threads getting stuck.

public class DeadLocks {
    static Object lock1=new Object();//object locks
    static Object lock2=new Object();

    static void main() {
        Thread t1=new Thread(() -> { // thread 1 is waiting for thread 2 to release its lock
            synchronized (lock1) {
                System.out.println("Thread 1: locked lock1 ");
                try {
                    Thread.sleep(100); // sleeps for 100 ms and give chance to thread 2
                }catch (Exception e) {
                }
                System.out.println("Thread 1 waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread 1 locked lock2");
                }
            }
        });

        Thread t2=new Thread(() -> { //thread 2 waitls ntil thread 1 releases its lock
            synchronized (lock2) {
                System.out.println("Thread 2: locked lock2 ");
                try {
                    Thread.sleep(100);
                }catch (Exception e) {
                }
                System.out.println("Thread 2 waiting for lock1");
                synchronized (lock1){
                    System.out.println("Thread 2 locked lock1");
                }

            }
        });
        t1.start();
        t2.start();


    }
}
