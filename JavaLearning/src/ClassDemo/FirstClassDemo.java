package ClassDemo;

public class FirstClassDemo{

	int x = 90;
	int y = 100;

	public static void main(String[] args) {

		FirstClassDemo obj = new FirstClassDemo();

		obj.sum();

		System.out.println("Only for print x value....." + obj.x);

		System.out.println("only for print y value...." + obj.y);

	}

	// methods..

	public void sum() {

		int a = 40;
		int b = 40;
		int c = b + a;
		System.out.println("sum two numbers.........." + c);
	}
}
