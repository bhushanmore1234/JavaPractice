package JavaPractice.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        /*
        Notes :
            1.Map stored Key value pairs data
            2.Put() : this is use to add data in map
            3.Keys should be unique or it will override values
            4.We can use putIfAbsent() method to overcome override values
            5.We can iterate map using Entry
            6.ContainsKey() this method use to find keys are present or not
            7.ContainsValue() this method use to find values are present or not
            8.isEmpty to check map is empty or not
        */

        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("This is my map data : "+ numbers);
        numbers.put("Two", 22);
        System.out.println("This is my map with override value of Two key  : "+ numbers);

        for (Map.Entry<String,Integer> e:numbers.entrySet())
        {
            System.out.println("We are iterating using Entry set : "+e);
            System.out.println("We are iterating using Entry set : "+e.getKey());
            System.out.println("We are iterating using Entry set : "+e.getValue());

        }
        for (String key:numbers.keySet())
        {
            System.out.println("We are iterating using key : "+key);
        }
        for (Integer value:numbers.values())
        {
            System.out.println("We are iterating using values : "+value);
        }

    }
}
