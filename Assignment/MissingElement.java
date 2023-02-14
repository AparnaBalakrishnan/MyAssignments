package week3.Assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int arr[]= {4,7,1,3,2,8,6};
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<=arr.length;i++)
		{
			j=i+1;
			if(arr[i]!=j)
			{
				System.out.println("The missing element = "+j);
				break;
			}
		}

	}


}
