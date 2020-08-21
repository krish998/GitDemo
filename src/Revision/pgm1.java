package Revision;

public class pgm1 {

	public static void main(String[] args) {
		// Create a method which accepts array and returns sum of all the elements in an array

		int [] a={2,3,4,5,6};//20
		int value= sumArray(a);
		System.out.println(value);
		System.out.println("aa");
		System.out.println("bb");
		
		
	}

	private static int sumArray(int[] a) {
		
		int sum=0;
		
		for (int i=0;i<=a.length-1;i++){
			
			sum=a[i]+sum;		
				
		}
		
		return sum;
	}

}
