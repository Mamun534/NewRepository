package ConditionalStatement;

public class IfelseIfDemo {

	public static void main(String[] args) {

		String browser = "Chrome";
		String browser1 = "firefox";

		if (browser.equalsIgnoreCase("firefox")) {   // ! =  Browser not equals Chrome that case browser execute firefox...
			System.out.println("test cases execute on firefox");
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("Test Cases execute on ie");
		}

		else if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("Test Case execute on chrome");
		}

		else {
			System.out.println("Kindly provied the vaild browser name");
		}

//..............................................................................................//

		/*if (num.equalsIgnoreCase("chrome")) {

			System.out.println("this is mamun browser");
		}

		else if (num.equalsIgnoreCase("shelly")) {

			System.out.println("this is shelly browser");
		}

		else if (num.equalsIgnoreCase("mamun")) {

			System.out.println("this is the right browser for mamun");*/
		}
	}


