package TestSuite;

import java.util.Scanner;

public class Practise10 {

	public static void main(String[] args) {
		//accepting input to check if it is prime or not and create a method
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first number- ");	
		int val=sc.nextInt();
		prime(val);
		
		/*// prime number verification in tw ways
		 * by creating a method prime val
		 * 2- By normal code without method
		int val=11;
		boolean flag=false;
		
		for(int i=2;i<val/2;i++){
			
			if (val%i==0){
				
				flag=true;
				break;
			}
			
		}
		
		if(flag){
			System.out.println("it is not prime");
		}

		else
			System.out.println("It is prime");*/
	}

	public static void prime(int val) {
		boolean flag=false;
		
		for(int i=2;i<val/2;i++){
			
			if (val%i==0){
				
				flag=true;
				break;
			}
			
		}
		
		if(flag){
			System.out.println(val +" is not prime");
		}

		else
			System.out.println(val+" is prime");
	
		

	}

}
