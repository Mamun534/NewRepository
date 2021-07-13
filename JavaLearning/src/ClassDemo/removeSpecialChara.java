package ClassDemo;

public class removeSpecialChara {

	public static void main(String[] args) {

									              // this is junk string
		
		String s = "Man..Can..Not..Live...Alone...*&%#@!@$%&)(*&% ..........0123456789";
		
		// ^ = its called not.....sign if not use it will remove all characters unless junk characters
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		//This Function only shows Capital Latter's...
		
		/*s=s.replaceAll("[^A-ZA-Z0-9]", "");
		System.out.println(s);*/
	}

}
