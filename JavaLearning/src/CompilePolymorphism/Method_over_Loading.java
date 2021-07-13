package CompilePolymorphism;

public class Method_over_Loading {

	// this is method overloading......... Same method name with different arguments or signatures..

	public void add(int a, int b)

	{
		int c = a + b;
		System.out.println("Add two numbers of values...." + c);
	}

	public void add(int a, int b, int d)

	{
		int c = a + b + d;
		System.out.println("Add three numbers of values...." + c);
	}

	public void add(int d)

	{
		int c = d;
		System.out.println("number of value...." + c);
	}

	public void add(int a, double b)

	{
		double c = a + b;
		System.out.println("number of value...." + c);
	}

	public void add(double a, double b)

	{
		double c = a + b;
		System.out.println("number of value...." + c);
	}

	public void add(double a, int b)

	{
		double c = a + b;
		System.out.println("number of value...." + c);
	}
}
