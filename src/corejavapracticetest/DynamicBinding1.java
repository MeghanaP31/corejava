package corejavapracticetest;
//class Animal {
//
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//Now:
//
//Animal animal = new Dog();
//animal.sound();
//
//Answer:
//
//What is the output?//dog barks
//Which sound() method is executed? sound() in Dog class
//Why? Dog object calls the overriden method , animal is reference type but dog is an actual object
//Is this static binding or dynamic binding?
//dynamic binding because it happens at runtime

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {

   @Override
    void sound() {
       System.out.println("Dog barks");
   }
}
public class DynamicBinding1 {
    static void main() {
        Animal animal=new Dog();
        animal.sound();

    }
}
