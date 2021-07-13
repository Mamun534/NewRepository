package SrtingBreakToArray;

public class StringDemo {

	public static void main(String[] args) {

		// any hyphen (-) i want want to split like :

		String fullname = "selenium-hp-tp-qt-java";
		
		String [] toolname = fullname.split("-");
		
		for(int i =0; i<toolname.length; i++) {
			
			
			System.out.println(toolname[i]); 
			
			System.out.println("value for toolname " +i+" is " +toolname[i]);
			
			//................................................
			
			if(toolname[i].equalsIgnoreCase("selenium")) {

				System.out.println("break Test is Passed ");
				
				break;  //if i do break that means its not looking any-other executions....doing break
						// if i don't give the break it will executions full for loop.....as well
				
			}
			
		}

	}

}
