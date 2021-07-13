package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		// this is giving me arithmetic Exception how i try and catch it
		
		/*
		 * int c = 10 / 0;
		 * 
		 * System.out.println(c);
		 */

		
		// Example is here how to Handle .....
		
		System.out.println("Tets Start Here");

		try {
			int c = 10 / 0;
			System.out.println("Div Result is " + c); // if this logic is correct it will print the result..
		} 
		// what ever exception is coming it will store an a object 
		
		catch (ArithmeticException a) {  

			System.out.println("Something went wrong please check the Exception " +a.getMessage()); // a.getmessage is div 10/0 
			System.out.println("Seems you have entered Zero please provide value>0");
		}
		System.out.println("Test End Here");
	}
}
