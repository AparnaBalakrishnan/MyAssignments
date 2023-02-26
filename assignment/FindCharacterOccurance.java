package assignment;

public class FindCharacterOccurance {
	public static void main(String[] args) {
		// Declare the String
		String text ="TestLeaf";
		// Declare the int variable
		int b=0;
		// Convert the String into Char
		char[] a= text.toCharArray();
		// Iterate the for loop
		for(int i=0;i<a.length;i++)
		{
			// if a[i] equal to e means the if condition is execute
			if(a[i]=='e')
			{
				// increment the b count
				b++;
			}
		}
		System.out.println("e Occurance is "+b);
	}

}
