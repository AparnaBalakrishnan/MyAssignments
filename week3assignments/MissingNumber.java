package week3assignments;
import java.util.Set;
import java.util.TreeSet;


public class MissingNumber {
	


		public static void main(String[] args) {

			int[] number = {8,4,2,3,6,7,1,9};
			Set<Integer> miss=new TreeSet<Integer>();
			for(int i=0;i<number.length;i++) {
				miss.add(number[i]);
			}
			Object[] ob=miss.toArray();
			for(int i=0;i<ob.length;i++) {
				int a=(Integer) ob[i];
				int j=(Integer) ob[i+1];
				if(j==a+1);
				else {
					a++;
					System.out.println(a);
				}
			}

		}

}
