package JavaPractice.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        /*
        Note :
        1.This is implemented in binary search tree
        2.Basically it will add elements in sorted form


         */

        Set<Integer> tset = new TreeSet<>();
        tset.add(1);
        tset.add(3);
        tset.add(4);
        tset.add(2);
        tset.add(5);

        System.out.println("Set Elements : "+tset);

        tset.remove(3);
        System.out.println("Element 3 removed from the set  : "+tset);

        System.out.println("Contains method will check given element present or not in the set ex-4 : "+tset.contains(4));
        System.out.println("isEmpty method will check set is empty or not  : "+tset.isEmpty());
        System.out.println("Size() method will check how many elements present in set  : "+tset.size());
        tset.clear();
        System.out.println("clear() method will clear set  : "+tset);

    }
}
