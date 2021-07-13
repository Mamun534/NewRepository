package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_HashMap {

	public static void main(String[] args) {

		// Creating ArrayList

		ArrayList<String> list = new ArrayList<String>();

		// Adding object in ArrayList

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		// Invoking ArrayList object

		System.out.println("ArrayList: " + list);

		// ...............Creating HashMap.......................

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding object in HashMap
		
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		
		// Invoking HashMap object // It might or might not display elements // in the insertion order
		System.out.print("HasMap: " + hm);
	}
}
