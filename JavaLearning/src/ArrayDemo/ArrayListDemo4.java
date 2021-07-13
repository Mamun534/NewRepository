package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(765489);
		al.add('m');
		al.add("Master");
		al.add("Selenium WebDriver");
		al.add(12.34);

		//1st scenario for loop
		
		int myListSize = al.size();
		for (int i=0; i<myListSize; i++) {

			System.out.println("Values From Array LIst is "+al.get(i));

			
			// 2nd scenario for loop using Enhance for loop...
			
			System.out.println("This is sceond scenario using Enhance foorlop");
			
			for(Object abc:al) {
				System.out.println("Values are "+abc);
			}
		}
	}

}
