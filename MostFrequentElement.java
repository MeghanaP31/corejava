package javacollectionstest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostFrequentElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 20, 20);

        Map<Integer,Integer> map=new HashMap<>();

        for(int num : numbers){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        int mostFrequency=0;
        int frequncyCount=0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > frequncyCount){
                frequncyCount = entry.getValue();
                mostFrequency=entry.getKey();
            }
        }
        System.out.println("most frequent element: "+mostFrequency);
        System.out.println("Frequency count: "+frequncyCount);

    }
}
