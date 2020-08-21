package Revision;

public class pgm3 {

	public static void main(String[] args) {
		// Max difference between adjacent index in an array
		
		int[] a={2,3,5,7,19,39};
		
		int value=maxDiff(a);
		System.out.println("the Differnece is"+value);
		

	}

	private static int maxDiff(int[] a) {

		int difference=0;
		for (int i=0;i<a.length-1;i++){
			//System.out.println(a.length);
			
			if(a[i+1]-a[i]>difference){
				
				difference=a[i+1]-a[i];
				
	
			}
				
		}
		
		
		return difference;	
	}

	
}
