package VariablesDemo;

public class SaticDemo {

	int x = 10;

	public static void main(String[] args) {

		// System.out.println(x); // this is coming error resone of this method is
		// static
		// if i want to access i have to create object

		SaticDemo sm = new SaticDemo();
		System.out.println(sm.x); // i can access now
		
		
		// this is for static method .....getmyname()
	
		String fullname = SaticDemo.getmyname("Mamun", "Chowadhury");
		System.out.println("This is my full Name....."+" "+fullname);
		

	}

	public void show() {

		System.out.println(x); // i can access here resone this is public
	}
	
	public static String getmyname(String firstname, String LastName) {
		
		String fullname = firstname+" "+LastName;
		return fullname;
		
	}
}
