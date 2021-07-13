package MethodOverRidding;

public class ParentClass {

	public void display() {

		System.out.println("Im Parent class display method");
	}
	
	
	// this is called method over riding same class or signature both of class as well 
	// parent class and child class ....which is method over ...public void show()  this method...

	public void show() {

		System.out.println("Im parent class show method");
	}

	public void show(String name) {

		System.out.println("Im parent class show method with signature");
	}
}
