package myLearning;

public class PalindromeWord {

	public static void main(String[] args) {
		String str = "1251";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev = rev +  str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Its a palindrome");
		}
		else{
			System.out.println("Its not a palindrome");
		}
	}

}
