package TestSuite;

public class Practise8 {

	public static void main(String[] args) {	
		//important pyramid concept
			
			for (int i=1; i<=4; i++){  // top for loop is for no of rows
				
				for (int j=1;j<=i;j++){  // second for loop is values in the rows

					System.out.print(j);
					//System.out.print("\t");
				}
				System.out.println();
			}
			
			for (int i=1; i<=4; i++){
				
				for (int j=4;j>=i;j--){
				
					System.out.print(j);
					//System.out.print("\t");
				}
				System.out.println();
			}
				


	}

}
