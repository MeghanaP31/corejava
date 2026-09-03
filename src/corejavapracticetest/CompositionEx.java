package corejavapracticetest;
//A Car should create and own its Engine

//What happens to the Engine object conceptually when the Car object is no longer used?
//this is composition where one object does not exist without another object
//if car doesnot exist then engine also gets deleted


class Engine{
    void start(){
        System.out.println("Engine started");
    }
}
class Car{
    private Engine engine;
    Car(){
        engine=new Engine(); // engine object
    }

    void carStart(){
        engine.start();
        System.out.println("Car started");
    }

}
public class CompositionEx {
    static void main() {
        Car c=new Car();
        c.carStart();

    }
}
