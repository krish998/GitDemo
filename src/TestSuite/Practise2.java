package TestSuite;

public class Practise2 {

	public static void main(String[] args) {
		
		// print 5 multiplication table without using multiply operator
	/*	
		int i =5;
		int mul=0;	
		
		while(mul<100)
		{
		mul=mul+i;
				System.out.println(mul);
		}
*/
		
	int result= multiply(5,20);	
		
		System.out.println(result);
				
	}

	public static int multiply(int i, int j) {
		
		int k=1;
		int sum=0;  // use variables as per reuirement
		
		while (k<=j){
		
		sum=sum+i;
			
			k++;
			
		}
		
		return sum;
	}

	
	
	
	

}
