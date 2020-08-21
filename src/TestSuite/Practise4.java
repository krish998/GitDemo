package TestSuite;

import java.util.ArrayList;

public class Practise4 {

	public static void main(String[] args) {
// compare indexes of 2 different arrays and create another array for matching values
		// Important concept of arraylist
		int[] a= {1,2,3,8};
		int[] b={5,6,3,8};
		//int x=0;
	//	int[] x =new int[4];
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		
		for (int i=0;i<a.length;i++){
			
			if(a[i]==b[i]){
				
				
				al.add(a[i]);
					
			}
			
		}
		
	//now extracting array from arraylist -- this is new tpye added in jjava 7 ..now current version is java 14
		
		Object[] c=al.toArray();
		
		for(Object obj : c)
		{
			System.out.print(obj);
			System.out.print("\t");
		}
		
	}
	

}
