package learnProg;


public class StringRev {

	public static void main(String[] args) {
		String str = "MADAM";
		char[] Array = str.toCharArray();
		
		for(int i=Array.length-1; i>=0;  i--) {
			System.out.print(Array[i]); 
		}

	}

}
