package exceptionHandeling;

public class exceptionHandletrycatch{

	public static void main(String[] args) {

		System.out.println("Start The Test");

		try {
			int c = 10 / 0;
			System.out.println("Div Result is " + c);
		}

		// e what ever exception it will store in e ...

		catch (ArithmeticException e) {

			System.out.println("Something went Wrong Please chacke the Exception" + e.getMessage());
			System.out.println("Seems you have entered Zero Please provide value >0");
		}
		System.out.println("End The Test");
	}

}
