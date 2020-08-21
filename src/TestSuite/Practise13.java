package TestSuite;

import java.util.Scanner;

public class Practise13 {

	public static void main(String[] args) {
		// Reverse the string/palindrome without using keyword
		
		Scanner sc= new Scanner(System.in);
		System.out.println("  Enter the string");
		String s=sc.next();
		String t=""; // decaring 3rd variable
		
		for(int i=s.length()-1;i>=0;i--) /// mostly it is similar to array
		{
	
			t=t + s.charAt(i);  // logic 
			
		}
		
		System.out.println(t);
		
		if (s==t);
		{
			System.out.println(s +" is a palindrome");
		}
		

	}

}
