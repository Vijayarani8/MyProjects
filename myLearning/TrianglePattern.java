package myLearning;

public class TrianglePattern {

	public static void main(String[] args) {
		 int n = 5;
		 //Right Angle Triangle
		 for(int i = 0; i<n; i++ ){
			 for(int j=0; j<=i; j++){
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 //Left Angle Triangle
		 for(int i=0; i<n; i++){
			 for(int j=2*(n-i); j>=0; j--){
				 System.out.print(" ");
			 }
			 for(int j=0; j<=i; j++){
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 //equal Triangle
		 for(int i=0; i<n; i++){
			 for(int j=n-i; j>1; j--){
				 System.out.print(" ");
			 }
			 for(int j=0; j<=i; j++){
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
