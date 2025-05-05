package JavaPractice.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		list.add(6); //It will add elements always at the end 
		System.out.println(list);
		
		list.add(3, 100);  // This will add element at given index position
		System.out.println(list);
		
		
		List<Integer> list1 = new ArrayList<>(); //Creating new list
		list1.add(200);
		list1.add(300);
		
		System.out.println(list1);
		System.out.println(list);
		
		list.addAll(list1); // This will add list1 element to list element
		
		System.out.println(list);
		System.out.println("This is to get index element = "+list.get(4));
		System.out.println("This is to remove index "+list.remove(3)+ " element = "+list);
		System.out.println("This is to remove specific value "+list.remove(Integer.valueOf(300))+ " element = "+list);
		System.out.println("List elements"+list1);
		list1.clear();// It will remove all elements 
		System.out.println("clear list function"+list1);
		
		list.set(2, 999); // This will set value at specific given index
		System.out.println(list);
		
		list.contains(999); // This will give true or false if value is present 
		System.out.println(list.contains(999));
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elements using for loop = "+list.get(i));
		}
		for (Integer element : list) {
			System.out.println("Elements using for each = "+element);
			
		}
	}

}
