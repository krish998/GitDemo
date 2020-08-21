package TestSuite;

public class Practise17 {

	public static void main(String[] args) {
		// Reverse any given number with Arthimetical operation
		
		int a =789;
		int k=1;
		int reverse=0;
		
		while( a!=0){
				
			int digit= a%10;
			reverse= reverse*10 + digit;  //this is the logic one should number and practise enough
			a=a/10;	
			
		}
		
		System.out.println(reverse);

	}

}
