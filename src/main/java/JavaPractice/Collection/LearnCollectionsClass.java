package JavaPractice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        /*
        Note :
        1.Collections class provide more functions to operate on collections
        2.Collections.min() : It will give you min value from collection
        3.Collections.max(list) : It will give you max value
        4.Collections.frequency(list,2) : It will give you frequency of number 2
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Unsorted list : "+list);

        System.out.println("This is min number : "+Collections.min(list));
        System.out.println("This is max number :"+Collections.max(list));
        System.out.println("This is num frequency/occurrence : "+Collections.frequency(list,2));

        Collections.sort(list);
        System.out.println("Sorted list : "+list);
    }
}
