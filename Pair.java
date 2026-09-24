package corejavatest;
//11. Write a generic class Pair<K, V> that holds two values of different
//    types, with getter methods and a toString() override. Write a generic
//    method swap() that swaps the values in an array at two given indices,
//    working for any object type.

public class Pair<K,v> {
    private K key;
    private v value;

    Pair(K key,v value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
    @Override
    public String toString(){
        return key+" "+value;
    }

    public static <T> void swap(T[] arr,int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void main() {
        Pair<String,Integer> p=new Pair<>("Anu",100);
        System.out.println(p.getKey()+" "+p.getValue());

        String[] names={"Anusha","Madhavi","Shruthi"};
        System.out.println("Before Swapping: ");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("After swapping");
        swap(names,0,1);
        for(String name : names){
            System.out.println(name);
        }

    }
}
