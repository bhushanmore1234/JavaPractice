package JavaPractice.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashset {
    public static void main(String[] args) {

/*
  Note :
   1.You can not add same element in set
   2.Add() method to add element
   3.Contains() this will return element present or not true/false
   4.Remove() this method use to remove element
   5.isEmpty() this method check set is empty or not
   6.size() this method return size of elements (How many elements present in set)
   7.clear() This method will clear whole set
 */
        Set<Integer> set = new HashSet<>();
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
