package TestSuite;

public class Practise12 {

	public static void main(String[] args) {
		// Printing minimum number and maximum number in a multidimensional array
		//need to keep in discussion board
			//very important
		int abc[][] = {{3,4,0},{5,15,6},{9,7,1}}; // declaration of 3D array
		int min=abc[0][0];  // taking min[0][0] is the key by assuming it as minimum
		int max=abc[0][0];

		/*System.out.println(y +" is maximum number");
		System.out.println(z +" is minimum number");*/
		//output maximum:9 minimum:1
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				if(abc[i][j]<min){	
					
					min=abc[i][j];  // storing in min when 3 less than 0
					
				}
				
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(abc[i][j]>max){	
					max=abc[i][j];
					
				}
				
			}
		}
		
		
		System.out.println(min +" is minimum number");
		System.out.println(max +" is maximum number");
		
	}
	
	

}
