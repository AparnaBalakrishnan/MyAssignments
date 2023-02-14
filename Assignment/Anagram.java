package week3.Assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="posts";
		int len1=text1.length();
		int len2=text2.length();
		if(len1==len2)
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean res=Arrays.equals(ch1, ch2);
			if(res=true)
			{
				System.out.println("It is Anagram");
			}
			else
			{
				System.out.println("It is Not Anagram");
			}
		}
	}

}
