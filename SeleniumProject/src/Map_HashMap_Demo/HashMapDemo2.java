package Map_HashMap_Demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
	

		HashMap<String, String> hm = new HashMap<String, String>();
				
		
		
		hm.put("101", "Mamun");
		hm.put("102", "Selenium");
		hm.put("103", "Java");
		hm.put("104", "QTP");
		hm.put("100", "Maven");
		hm.put("105", "Appium");
		hm.put("106", "Katalon");
	
		for(Map.Entry<String, String>data :hm.entrySet()) {
			
			System.out.println("Key from Map is " + data.getKey()+"  "+"And Value is "+data.getValue() );
		}
	}

}
