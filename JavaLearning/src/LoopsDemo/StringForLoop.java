package LoopsDemo;

public class StringForLoop {

	public static void main(String[] args) {

		// Reverse String using for loop

		String num = "DOG";
		String rev = "";
		
		System.out.println(num);
		
		int len = num.length();
		
		
		for(int i =len-1; i>=0; i--) {
			
			rev = rev+num.charAt(i);
		}
		System.out.println("Reverse the String DOG....."+rev);
	}

}
