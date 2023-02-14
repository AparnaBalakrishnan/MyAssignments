package week3.Assignment;

public class Palindrome {
	public static void main(String[] args) {
		String text="madam";
		String rev="";
		char[] arr=text.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		if(text.equals(rev))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
