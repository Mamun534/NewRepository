package ConditionalStatement;

public class SwitchDemo {

	public static void main(String[] args) {

		int x = 5;
		
		switch (x) {

		case 1:
			System.out.println("this is poor performance");
			break;

		case 2:
			System.out.println("this is slow performance");
			break;
			
		case 3:
			System.out.println("Metting expectation");
			break;
			
		case 4:
			System.out.println("Well done keep rocking");
			break;
			
		case 5:
			System.out.println("Student of the year");
			break;
			
		default:
			System.out.println("Youy are fired");
		}

	}

}
