package TestSuite;

import java.util.ArrayList;

public class Practise15 {

	public static void main(String[] args) {
		// Print unique numbers by eliminating duplicate numbers
		
		int a[]={7,8,9,9,8,6,6,7};
		
		ArrayList<Integer>ab=new ArrayList<Integer>();  // this concept is used to compare two arrays in picture
		
		for (int i=0;i<a.length;i++)
		{
			int k=0;
			
			if(!ab.contains(a[i])){  //using negation to store the index value in an empty array using arraylist concept
				
				ab.add(a[i]);   // here we are adding index
				k++;
				
				for (int j=i+1;j<a.length;j++){  //
					
					if (a[i]== a[j]){
						
						k++;  // here k gets increased for every duplicate number
				
					}
				}
				
				if(k==1){  // No.of times an integer present in a array, if it present only once execute this block
					System.out.println(a[i]+ " is a unique number");
				}
				
			}
			
		}
		
		
	}

}
