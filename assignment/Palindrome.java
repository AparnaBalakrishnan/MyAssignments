package assignment;

public class Palindrome {
	public static void main(String[] args) {
		// Declare the String value as "madam"
		String name="madam";
		// Declare the empty String
		String rev="";
		// Convert the String into char
		char[] arr=name.toCharArray();
		// Reverse For loop
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		// if condition to check the name and rev are equal or not 
		if(name.equals(rev))
		{
			System.out.println("The given String is Palindrome");
		}
		// if name and rev are not equal means the else part will execute
		else
		{
			System.out.println("The given String is not a Palindrome");
		}
	}


}
