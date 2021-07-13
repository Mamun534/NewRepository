package HashMapCollision;

import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Map;
import java.util.Map.*;
import java.util.Map.Entry.*;
import java.util.TreeMap;
import java.util.TreeMap.*;

public class sortHashMap {

	public static void main(String[] args) {
		
		String a = "Man";
		String b = "Woman";
		
		HashMap<String, String> unsortedmap = new HashMap<>();
		
		unsortedmap.put("man","Woman");
		//unsortedmap.put("Cat","Dog");
		System.out.println(unsortedmap.get("a"));
		
		
		TreeMap<String, String> sortedmap = new TreeMap<>(unsortedmap);
		for(Map.Entry<String, String>Entry:sortedmap.entrySet());
		System.out.println();
	}
}
