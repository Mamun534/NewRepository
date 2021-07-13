package HowtoConnetMultipleClass;

public class MainClass {

	public static void main(String[] args) {

		Calculator cl = new Calculator();
		
		AnotherClass ac = new AnotherClass();

		 cl.sub(); 
		 
		 // this is when a modifier make private in calculator class no access 
		// if i want to access i have to make it public in calculator class...
		
		cl.sum();
		
		//System.out.println(cl.c);
		
		System.out.println("This is for anotherclass.......");
		
		ac.firstname();
		ac.lastname();
		ac.address();
		ac.city();
		ac.zipcode();
		ac.gpa();
		ac.grade();
		ac.country();
		
		System.out.println("Best of Luck in your futures.....!");
	
		
		// there im using advance calculator.... when i make it static that means i can use it by direct class name ...like
		
		
		System.out.println("       "+"This is for AdvanceCalculator......");
		
		AdvanceCalculator.sum();
		AdvanceCalculator.sub();
		
	}

	
}
