package exceptionHandeling;

import java.util.InputMismatchException;

public class exceptionHandletryfinally{

	public static void main(String[] args) {

		System.out.println("Start The Test");

		try {
			int c = 10 / 0;
			System.out.println("Div Result is " + c);
		}

		// e what ever exception it will stote in e ...

		catch (ArithmeticException e) {

			System.out.println("Something went Wrong Please chacke the Exception" + e.getMessage());
			System.out.println("Seems you have entered Zero Please provide value >0");
		} 
		
		catch(InputMismatchException e)
		{
			System.out.println("Hey Please enter only integer values");
		}
		catch(Exception e) 
		{
			System.out.println("Oops Somethings Went Wrong");
		}
		finally 
		{
			System.out.println("Finally block");
		}
		System.out.println("End The Test");
	}

}
