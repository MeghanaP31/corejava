package corejavatest;
//14. Implement a custom Iterable collection class (e.g., a simple Stack<T>
//    or LinkedList<T>) that supports the enhanced for-loop by implementing
//    Iterator<T>.

import java.util.Iterator;

class Stack<T> implements Iterable<T>{
    private T[] items;
    private int size;

    Stack(int capacity){
        items = (T[]) new Object[capacity];//capacity is dynamic,based on the items it ++,--
    }
    public void push(T item){
        items[size] =item;//adds items in stack
        size++; // increments size while adding items
    }

    public T pop(){
        return items[--size]; // decrements size while removing items
    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
           int  index =0;
            @Override
            public boolean hasNext() { // checks if it has elements
                return index < size;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }
}
public class CustomIterable {
    static void main() {
        Stack<String> s=new Stack<>(5);
        s.push("A");
        s.push("B");
        s.push("C");

        for(String str: s){ //enhanced for loop
            System.out.println(str);
        }

    }

}
