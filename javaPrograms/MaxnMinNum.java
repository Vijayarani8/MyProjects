package javaPrograms;

public class MaxnMinNum {

	public static void main(String[] args) {
		int n[] = {1,2,5,10,33,47,4,21,81,37,91,102};
		
		int smallest = n[0];
		int largest = n[0];
		for(int i = 1; i<n.length; i++)
		{
			if(n[i]>largest)
				largest = n[i];
			else if(n[i]<smallest)
				smallest = n[i];
		}
		System.out.println(" Largest Number is "+largest);
		System.out.println(" Smallest Number is "+smallest);
	}

}

