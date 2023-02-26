package assignment;

public class PrintDuplicate {
	public static void main(String[] args) {
		// Declare the variable as array
		int number[]= {11,22,33,44,55,66,22,77,11};
		// iterate for loop
		for(int i=0;i<number.length;i++)
		{
			// here iterate for loop as j to ckeck the i is equal to j or not
			for(int j=i+1;j<number.length;j++)
			{
				// if i equal to j means the if condition is execute
				if(number[i]==number[j]) {
					System.out.println(number[j]);
				}
			}
		}

	}


}
