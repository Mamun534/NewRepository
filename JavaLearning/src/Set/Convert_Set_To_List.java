package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Convert_Set_To_List {

	public static void main(String[] args) {
		
		Set<String> value = new HashSet<>();

		value.add("Java");
		
		value.add("Selenium");
		
		value.add("1");
		
		value.add("Mukesh");
		
		value.add("Man");
		
		value.add("22");
		
		value.add("abc");
		
		System.out.println(value);
		
		ArrayList<String> list = new ArrayList<>(value);
		System.out.println(list.get(4));
	}

}
