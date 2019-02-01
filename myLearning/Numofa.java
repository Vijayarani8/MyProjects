package myLearning;

public class Numofa {

	public static void main(String[] args) {
		int count = 0;
		String s = "Vijayarani";
		char [] text = s.toCharArray();

		for(char c : text){
			if(c=='i'){
				count++;
			}
		}
		System.out.println(count);
	}



}

