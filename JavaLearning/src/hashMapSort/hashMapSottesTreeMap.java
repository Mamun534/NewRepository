package hashMapSort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMapSottesTreeMap {

	public static void main(String[] args) {

		  HashMap<String, Integer> unsortedmap = new HashMap<>();

		 unsortedmap.put("Seven", 7); unsortedmap.put("One", 1);
		 unsortedmap.put("Ten", 10);  unsortedmap.put("Two", 2);
		 unsortedmap.put("Nine", 9);  unsortedmap.put("Three", 3);
		 unsortedmap.put("Eight", 8); unsortedmap.put("Five", 5);
		 unsortedmap.put("Four", 4);  unsortedmap.put("Six", 6);
		 
		  for
		  	(String number : unsortedmap.keySet())
		  {
			  System.out.println("This is HashMap :" + number);
		  }
		 
		  // HashMap LinkedHashMap Sorted to..........
		
		  LinkedHashMap<String, Integer> sorted1 = new LinkedHashMap<>();
		 
		  unsortedmap.put("Seven", 7); sorted1.put("One", 1);
		  unsortedmap.put("Ten", 10); sorted1.put("Two", 2);
		  unsortedmap.put("Nine", 9); sorted1.put("Three", 3);
		  unsortedmap.put("Eight", 8); sorted1.put("Five", 5);
		  unsortedmap.put("Four", 4); sorted1.put("Six", 6);
		  
		  for 
		  	(Map.Entry<String, Integer> entry : sorted1.entrySet())
		  {
			  System.out.println("This is for LinkedHashMap : " + entry.getKey());
			  System.out.println("This is for LinkedHashMap : " + entry.getValue()); 
		  }
		 
		//HashMap sorted for TreeMap.......
		
		unsortedmap.put("Seven", 7);
		unsortedmap.put("One", 1);
		unsortedmap.put("Ten", 10);
		unsortedmap.put("Two", 2);
		unsortedmap.put("Nine", 9);
		unsortedmap.put("Three", 3);
		unsortedmap.put("Eight", 8);
		unsortedmap.put("Five", 5);
		unsortedmap.put("Four", 4);
		unsortedmap.put("Six", 6);
		
		TreeMap<String, Integer> sortedmap = new TreeMap<>(unsortedmap);

		for 
			(Map.Entry<String, Integer> entry : sortedmap.entrySet()) 
		{
			System.out.println("This is for TreeMap : " + entry.getKey());
			System.out.println("This is for Treemap : " + entry.getValue());
		}
	}

}
