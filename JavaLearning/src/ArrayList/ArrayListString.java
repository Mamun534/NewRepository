package ArrayList;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
	
		ArrayList<String> obj = new ArrayList<String>();

		 obj.add("mamun");
		 obj.add("Selenium");
		 obj.add("Chowdhury");
		 
		 for(String value:obj) {
			 System.out.println(value);
		 }
	}

}
