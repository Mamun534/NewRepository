package ArrayDemo;

import java.util.ArrayList;

public class ArrayListEnahance {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(765489);
		al.add('m');
		al.add("Master");
		al.add("Selenium WebDriver");
		al.add(12.34);

	
			System.out.println("This is sceond scenario using Enhance foorlop");
			
			for(Object abc:al) {
				System.out.println("Values are "+abc);
			}
		}
	}


