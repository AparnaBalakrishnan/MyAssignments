package week2.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int p=72;
		boolean flag =true;
		for(int i=2;i<p;i++)
		{
			if(p%1==0)
			{
				flag=false;
				break;
				
			}
		}
		if(flag==true) 
		{
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime Number");
		}
			
		
	}

}
