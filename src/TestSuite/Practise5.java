package TestSuite;

import java.util.ArrayList;

public class Practise5 {

	public static void main(String[] args) {
		// Sort the array in ascending and descending order
		
	int[] a={5,3,2,7,1};
	int temp;  // this variable forms the crux
	
	
	for (int i=0;i<a.length;i++){
		
		for(int  j=i+1;j<a.length;j++){
			
			if(a[i]>a[j]){
				temp=a[i];  //swapping places
				a[i]=a[j];
				a[j]= temp;
						
			}		
		}			
	}
	
	for(int i=0;i<5;i++){
		System.out.print(a[i]);   //?? how this 
		
		
	}
	
	/*Object[] A=al.toArray();
	
	for(Object obj : A)
	{
		System.out.println(obj);
	}
	*/
	
	}

}
