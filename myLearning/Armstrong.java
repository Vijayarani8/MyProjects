package seleniumLearn;

public class Armstrong {

	public static void main(String[] args) {
		int n,remainder,temp = 0;
		System.out.println("Armstrong numbers are:");

		for(int i=100; i<=1000; i++){

			n=i;
			while(n>100){
				remainder=n % 10;
				temp = temp + (remainder*remainder*remainder);
				n=n / 10;
			}
			if(temp==i){
				System.out.println(i+" ");
			}
			temp = 0;
		}

	}
}
