package TestSuite;

public class Practise11 {

	public static void main(String[] args) {
		// Printing minimum number and maximum number in a multidimensional array
		
		int[] a={3,4,2};
		int[] b={9,7,6};
		int[] c={5,1,8};
		int abc = 0;
		
	int y=	maxnum(a);
	int z=	minimum(a);
		System.out.println(y +" is maximum number");
		System.out.println(z+" is minimum number");
		//output maximum:9 minimum:1
		

	}

	private static int minimum(int[] a) {
		// Minimum number
	int temp=0;
	for (int i=0; i<=a.length;i++)
	{
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){		
				a[i]=a[j];
				//a[j]=temp;
				temp=a[i]; // temp variable is for returnig the value
			}
			
		}
		
	}
	
	//for (int i=0;i<=2;i++)
	//System.out.println(temp +"is the minimum number");
		
		
		return temp;
	}

	private static int maxnum(int[] a) {
		// Maximum number
		int temp=0;
		for (int i=0; i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){		
					a[i]=a[j];
					//a[j]=temp;
					temp=a[i];
				}			
			}
			
		}
		
		
		return temp;
	}

}
