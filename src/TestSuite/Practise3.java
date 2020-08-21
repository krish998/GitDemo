package TestSuite;

public class Practise3 {

	public static void main(String[] args) {
		// Max difference between adjacent index in an array
		
		int[] a={1,5,7,9,20};
			int Max=Maxdiff(a);
		System.out.println(Max);
	}

	public static int Maxdiff(int[] a) {
		
		int diff=0;  	
		//Using extra variable can solve a problem
		for (int i=0;i<a.length-1;i++){
			
			if(a[i+1]-a[i]>diff){
				 diff=a[i+1]-a[i];		
			}
					
		}
			return diff;
	}

}
