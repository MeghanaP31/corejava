package corejavatest;
//13. Implement a thread-safe Singleton class using double-checked locking
//    with the volatile keyword. Explain in comments why each part is
//    necessary.

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){ // checks the obj is existed or not
            synchronized (Singleton.class){ // only 1 thread enter here
                if(instance == null){// checks if another thread created any obj
                    instance = new Singleton();//creates singleton obj only once

                }
            }
        }
        return instance;
    }
}
public class VolatileEx {
    static void main() {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1 == s2);

    }
}
