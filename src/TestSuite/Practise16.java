package TestSuite;

public class Practise16 {

	public static void main(String[] args) {
		// Counting occurences in the string
		
	int count=	countOccurences("kkkkkkkkkkkkasdd",'d');  // declaring char with '' whereas string ""
	System.out.println(count);

	}

	public static int countOccurences(String word, char c) {   
		
		int count=0;
		for(int i=0;i<word.length();i++){
			
			if(word.charAt(i)==c){		  //charAt is important too // equating with C
				count++;
			}
		}
		
		
		return count;
		// TODO Auto-generated method stub
		
	}

}
