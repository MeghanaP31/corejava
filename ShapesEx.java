package corejavatest;
//3. Write a Shape class hierarchy (Circle, Rectangle, Triangle) where each
//   subclass overrides an area() method. Write a main method that stores
//   different shapes in a List<Shape> and prints the total area of all shapes.

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape{
    double radius ;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }

}

class Rectangle extends Shape {
    double length ;
    double width ;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    double area(){
        return length*width;

    }
}

class Triangle extends Shape {
    double base ;
    double height ;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    double area(){
        return 0.5 * base * height ;

    }
}
public class ShapesEx{
    static void main() {

        List<Shape> list=new ArrayList<>();
        list.add(new Circle(10));
        list.add(new Rectangle(16,18));
        list.add(new Triangle(10,12));

        double totalarea = 0;

        for(Shape s:list){
            totalarea =totalarea + s.area();
        }
        System.out.println("total Area: "+totalarea);
    }

}