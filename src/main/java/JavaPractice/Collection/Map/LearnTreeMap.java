package JavaPractice.Collection.Map;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {

        /*
        Notes :
        1.Tree map stored value in binary search
        2.Basically it will stored map in key order
        3.Remove() this function use to remove map using key specified

        */
        Map<String,Integer> numbers = new TreeMap<>();
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

        Map<Integer,String> nMap = new TreeMap<>();
        nMap.put(2,"Two");
        nMap.put(3,"Three");
        nMap.put(4,"Four");
        nMap.put(1,"One");
        nMap.put(5,"Five");
        System.out.println("New Map : "+nMap);
        nMap.remove(2);
        System.out.println("Removed key 2 : "+nMap);

    }
}
