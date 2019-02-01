package myLearning;

public class DuplicateLetter {

	public static void main(String[] args) {
		String str = "MeenaMee";
		
		char[] Array = str.toCharArray();
		for(int i = 0; i < str.length(); i++){
			for(int j= i + 1; j < str.length(); j++){
				if(Array[i] == Array[j]){
				
					char c = Array[j];
					System.out.print(c);
					break;

				}
			}
		}
	}
}



