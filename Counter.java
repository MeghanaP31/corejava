package corejavatest;
//7. Write a Counter class with an increment() method called by 100 threads,
//   each incrementing 1000 times. Demonstrate the race condition with the
//   unsynchronized version, then fix it using synchronized.

public class Counter {
    int inc = 0;

    public synchronized void increment(){ // synchronized version
        inc++;
    }
    public int getInc(){
        return inc;
    }

    static void main() throws InterruptedException {
        Counter c=new Counter();

        int numOfThreads =100;
        int incrementByThread = 1000;

        Thread[] t=new Thread[numOfThreads];

        for (int i=0;i< numOfThreads;i++) {//if i< 100, increments
            t[i] = new Thread(() -> {
                for (int j = 0; j < incrementByThread; j++) { //if j< 1000,increments
                    c.increment();

                }
            });
            t[i].start();
        }
        for(Thread thread : t){
            thread.join(); // race condition
        }
        System.out.println(c.getInc());//everytime the count is different in race condiotn
        //it is handled using synchronized ......exact count executes now
    }

}
