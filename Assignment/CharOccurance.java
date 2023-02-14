package week3.Assignment;

public class CharOccurance {
	public static void main(String[] args) {
		
	String str="I am Aparna";
	int count=0;
	int len=str.length();
	char[] ch=str.toCharArray();
	for(int i=0;i<len;i++) {
		if(ch[i]=='e') {
			count++;
		}
	}
	System.out.println(count);


}



}
