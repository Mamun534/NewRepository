package ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(765489);
		al.add('M');
		al.add("Selenium WebDriver");
		al.add(12.34);

		// Simple Scenario .......
								System.out.println(al);
								// System.out.println(al.get(3));

				// 2nd Scenario exm: using size...for loop

								int myListSize = al.size();
								for (int i = 0; i < myListSize; i++) {
								System.out.println("Values From Array LIst is " + al.get(i));
								
				//3rd Scenario exm: using Enahance for loop.....	
								for(Object abc:al) {
									System.out.println("Values are "+abc);
									
				//4th Scenario exm: using Iterator for loop.....
									
									Iterator itr = al.iterator();
									while(itr.hasNext()) {
									Object value = itr.next();
									System.out.println("Values are "+value);				
									
				}			
			}					
		}
	}
}
