package week3assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

		public static void main(String[] args) {

			String[] languages= {"c","c++","java","python","mysql","html"};

			
			List<String> word=new ArrayList<String>();
			for(int i=0;i<languages.length;i++) {
				word.add(languages[i]);
			}
			Collections.sort(word);
			Collections.reverse(word);
			System.out.println(word);

		}

}
