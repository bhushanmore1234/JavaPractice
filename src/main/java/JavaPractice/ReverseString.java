package JavaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string = ");
		String str = sc.next();
		String org_str = str;
		
		String revStr = "";
		
		int length = str.length();
		
		for(int i =length-1;i>=0;i--)
		{
			revStr = revStr+str.charAt(i);
		}

		System.out.println(revStr);
		
		if(org_str.contentEquals(revStr))
		{
			System.out.println("String is palindrom");
		}else System.out.println("String is not palindrom");
	}

}
