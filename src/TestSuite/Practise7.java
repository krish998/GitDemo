package TestSuite;

public class Practise7 {

	public static void main(String[] args) {
		//  printing the pyramid
		// can be used to understand outerloop and Inner loop
		
		for (int i=1;i<=19;i++){
			
			for (int j=19;j>=i;j--){
				
				System.out.print(j);
				//System.out.print("\t");
			}
			
			System.out.println("");
			
			
		}
		
	for (int i=19;i<=38;i++){
		
		for(int j=19;j<=i;j++){
			
			System.out.print(j);
		}
		System.out.println();
			
		}
		
		

	}

}
