package Revision;

public class pgm2 {

	public static void main(String[] args) {
		// print 5 multiplication table without using multiply operator
		
		int op=mulTable(5,10);
		System.out.println(op);
		System.out.println("a");

	}

	private static int mulTable(int i, int j) {
		
		int value=0;
		int x=1;
		
		/*for (int x=1;x<=j;x++){
			
			value=value+i;
					
		}*/
		
		while(x<=j){
			
			value=value+i;
			x++;
			
		}
		
		return value;
	}

}
