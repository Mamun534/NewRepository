package ConstructorDemo;

public class Student {
	
	
	// method over loading same methods name with different signatures or arguments .......

	public static void main(String[] args) {

		Student st = new Student(1);
		st.displayResultstudent();

	}

	public Student() {

		System.out.println("Welcome to the School");
	}

	public Student(String SchoolName) {

		System.out.println("Thanar Hat High School ");
	}

	public Student(int rank) {

		System.out.println("Thanar Hat High School Student Rank "+rank);
	}

	public Student(String SchoolName, int rank) {

		System.out.println("Thanar Hat High School");
	}

	public void displayResultstudent() {

		System.out.println("Marks are 90");
	}

}
