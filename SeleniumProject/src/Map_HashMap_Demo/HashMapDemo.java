package Map_HashMap_Demo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	

		HashMap<String, String> hm = new HashMap<String, String>();
		
		
		// This is key and Values....How we Insert.....
		
		hm.put("101", "Mamun");
		hm.put("102", "Selenium");
		hm.put("103", "Java");
		hm.put("104", "QTP");
		
		hm.put("101", "Maven"); // This is Duplicate is not allowed...try to console as follow
		
		hm.put("105", "Appium");
		hm.put("106", "Katalon");
		
		System.out.println(hm);
		
		String value = hm.get("105");
		System.out.println("This is value for Map "+value);
	}

}
