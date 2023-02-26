package assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		// Declare the array 
		int num[]= {2,5,6,8,9,1,3,4};
		// Here sorting the array
		Arrays.sort(num);
		// Declare the int variable as j 
		int j=0;
		// Iterate the for loop
		for(int i=0;i<=num.length;i++)
		{
			j=i+1;
			// if num[i] not equal to j means the if condition is execute
			if(num[i]!=j)
			{
				System.out.println("The missing element = "+j);
				// Break the if condition
				break;
			}
		}

	}


}
