package javaPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		int a, temp, b = 0;
		int c = 153;
		temp = c;
		while(c>0){
			a = c%10;
			c = c/10;
			b = b+(a*a*a);
		}
		if(temp==b){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}

	}

}
