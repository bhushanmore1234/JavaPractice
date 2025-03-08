package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringcharacters {

	public static void main(String[] args) {
		
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter any string ");
			String userInput = myObj.nextLine();
			characterCount(userInput);
		}
		

	}
	
	private  static void characterCount(String name)
	{
		char stringChar[] = name.toCharArray();
		Map<Character , Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c : stringChar)
		{
			if (charMap.containsKey(c)) {
				
				charMap.put(c,charMap.get(c)+1);
				
			}
			else
			{
				charMap.put(c,1);
			}
		}
		System.out.println(name +" : "+charMap);
	}

}
