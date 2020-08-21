package TestSuite;

public class Practise14 {

	public static void main(String[] args) {
		// Eliminate duplicate numbers and print unique numbers in the array
		//its only printing duplicate numbers
		int[] a={7,8,9,8,6,6,7};
		int temp=0;
		
		for (int i=0;i<=a.length;i++){
			
			for (int j=i+1;j<a.length;j++){
				
				if (a[i]== a[j]){
					
					temp=a[i];
					
					System.out.println(temp +" is a duplicate number");
				}
	
			}
			
		}
		
		
		
		

	}

}
