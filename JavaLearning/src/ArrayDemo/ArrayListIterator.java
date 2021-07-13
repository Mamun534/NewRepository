package ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(765489);
		al.add('m');
		al.add("Master");
		al.add("Selenium WebDriver");
		al.add(12.34);

		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
		Object value = itr.next();
		System.out.println("Values are "+value);
		}
	}

}
