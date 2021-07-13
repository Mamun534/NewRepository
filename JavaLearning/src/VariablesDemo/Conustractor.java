package VariablesDemo;

public class Conustractor {

	int roll;
	double marks;

	public Conustractor(int roll, double marks) {

		this.roll = roll;
		this.marks = marks;
	}
	
	public void show() {
		
		int x = 19;
		System.out.println(x);
		
		System.out.println("Roll number "+roll +" "+ "and marks are"+" "+marks);
	}
}
