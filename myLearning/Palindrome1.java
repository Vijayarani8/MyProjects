package seleniumLearn;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String text = sc.next();
		String rev = "";

		for (int i = text.length() - 1; i > -1;  i--){
	rev = rev + text.charAt(i);
		}
	if(text.equals(rev)){
		System.out.println("Palindrome");
	}
	else{
		System.out.println("not a Palindrome");
	}
}
	}

