package assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		// Declare the Scanner class to get the input from the user side
		Scanner scan =new Scanner(System.in);
		// Print the Statement 
		System.out.println("Enter your name=");
		// Get the input from the user and stored in the String name
		String name=scan.nextLine();
		// Print the name
		System.out.println(name);
		// Convert the String into char
		char[] reverse=name.toCharArray();
		// Iterate the reverse for loop
		for(int i=reverse.length-1;i>=0;i--)
		{
			System.out.println(reverse[i]);
		}
	}


}
