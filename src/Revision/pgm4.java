package Revision;

import java.util.ArrayList;

public class pgm4 {

	public static void main(String[] args) {
		// compare indexes of 2 different arrays and create another array for matching values
		
		int[] a={2,3,4,5,7};
		int[] b={5,6,7,5,8,2};
		
		int k=0;;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++){
	
			for(int j=0;j<b.length;j++){
				
		
				if(a[i]==b[j]){
					
					al.add(a[i]);
					k++;
				}
				
		}
	
		}
		
		System.out.println(k);
		
		
		/*Object[] c = al.toArray();
		
		for (Object obj : c){
			System.out.println(obj);
		}*/
		
Object[] c=al.toArray();
		
		for(Object obj : c)
		{
			System.out.print(obj);
			System.out.print("\t");
		}
		
	}

}
