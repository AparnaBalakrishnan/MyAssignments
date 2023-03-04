package week3assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
		public static void main(String[] args) 
		{

			int[] number = {5,9,7,1,4,6,2,8};
			Set<Integer> find=new TreeSet<Integer>();
			for(int i=0;i<number.length;i++) 
			{
				find.add(number[i]);
			}
			List<Integer> large=new ArrayList<Integer>(find);
			System.out.println(large.get(large.size()-2));

		}


}
