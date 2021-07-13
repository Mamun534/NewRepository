package MethodOverRidding;

public class ChildClass extends ParentClass{

	public static void main(String []args) {
		
		
		// Only This 3 scenario java access to us doing job....
		
		ChildClass cd = new ChildClass();
		cd.display();
		
		ParentClass pc = new ParentClass();
		pc.display();
		
		ParentClass pc1 = new ChildClass();
		pc1.display();
		
		// ChildClasspc2 = new ParentClass(); This is not allowed..
	}

	public void display() {

		System.out.println("Im child class display method");
	}
}
