package InharitanceDemo;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		ChildClass cd = new ChildClass();

		cd.add();
		cd.sub();
		cd.mul();
		cd.div();
	}

	public void mul() {

		System.out.println("This is child class multificatio 2500 ");
	}

	public void div() {

		System.out.println("This is child class div 2250 ");
	}
}
