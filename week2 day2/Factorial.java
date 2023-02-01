package week2.day2;

public class Factorial {
	public static void main(String[] args) {
		int n=7;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial Number ="+fact);	
	}

}
