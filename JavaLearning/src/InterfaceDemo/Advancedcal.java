package InterfaceDemo;

public class Advancedcal implements Calculator {

	public static void main(String[] args) {
		
		Advancedcal ac = new Advancedcal();
		ac.add();
		ac.sub();
		ac.mul();
		ac.div();
		ac.advancecal();
	}
	
	public void advancecal() {
		
		System.out.println("im in advanced calculator");
	}

	@Override
	public void add() {
	
		System.out.println("im in add method");
	}

	@Override
	public void sub() {
		
		System.out.println("im in sub method");
	}

	@Override
	public void mul() {
		
		System.out.println("im in mul method");
	}

	@Override
	public void div() {
	
		System.out.println("im in div method");
	}

}
