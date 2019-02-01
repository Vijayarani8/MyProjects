package myLearning;

public class CompareStrings {

	public static void main(String[] args) {
		String s1 = "Geeks";
		String s2 = "Geeksjkh";

		boolean flag = true;
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				flag = false;
				break;
			}

		}

		if(flag) {
			System.out.println("Strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}
	}
}