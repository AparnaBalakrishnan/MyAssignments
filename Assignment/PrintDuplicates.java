package week3.Assignment;

public class PrintDuplicates {
	public static void main(String[] args) {	
	int num[]= {1,3,2,3,6,5,2};
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]==num[j]) {
				System.out.println(num[j]);
			}
		}
	}

}
}