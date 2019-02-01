package myLearning;

public class NumberPattern {

	public static void main(String[] args) {
		int n = 5;
		//Number pattern
		for(int i=0; i<n; i++){
			int num=1;
			for(int j=0; j<=i; j++){
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
		//Incremental Number pattern
		int numa = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.print(numa+ " ");
				numa = numa+1;
			}
			System.out.println();
		}
	}

}
