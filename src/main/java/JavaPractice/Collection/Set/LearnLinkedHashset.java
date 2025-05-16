package JavaPractice.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        /*
        Note :
        1.Linkedhashset will add elements in given order
        2.Everything will be same as per HashSet
        3.Difference between Hashset and LinkedHashset is ordering in hashset order is not fixed
          but in LinkedHashset whatever order you specify elements will get added in same order
        */
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(5);

        System.out.println("Set Elements : "+set);

        set.remove(3);
        System.out.println("Element 3 removed from the set  : "+set);

        System.out.println("Contains method will check given element present or not in the set ex-4 : "+set.contains(4));
        System.out.println("isEmpty method will check set is empty or not  : "+set.isEmpty());
        System.out.println("Size() method will check how many elements present in set  : "+set.size());
        set.clear();
        System.out.println("clear() method will clear set  : "+set);
    }
}
