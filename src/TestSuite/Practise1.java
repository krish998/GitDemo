package TestSuite;

public class Practise1 {

	public static void main(String[] args) {
		
		// create a method which accepts array and returns sum of all the elements in array 
		
		int[] a= {1,2,3,4,5};  // syntax of array
		
		int sum=sumArray(a);
		System.out.println(sum);
		
	}

	public static int sumArray(int[] a) {
		//declaring static we cannot create object
		int sum=0;
		
		for (int i=0; i<a.length ;i++){
			
			sum=a[i]+sum;
			
		}
		
		return sum;
	}

}
