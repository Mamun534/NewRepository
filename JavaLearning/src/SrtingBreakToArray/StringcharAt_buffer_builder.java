package SrtingBreakToArray;

public class StringcharAt_buffer_builder {

	public static void main(String[] args) {

		String name = "Mamun Chowdhury";
		

		// String reverse using StringBuffer 
		
		StringBuffer sb = new StringBuffer("Mamun Chowdhury");
		StringBuffer rev = sb.reverse();
		System.out.println("This is Reverse by StrBuffer...."+rev);

		// String reverse using StringBuilder 
		
		 StringBuilder sd = new StringBuilder("Mamun Chowdhury");
		 StringBuilder rev1 = sd.reverse();
		 System.out.println("This is Reverse by StrBuilder...."+rev1);
	
		 
		 //charAt like bellow 
		 
		 name.charAt(4);

		
		 
		 // this all syso give my name back....one by one ..
		 
		System.out.print(name.charAt(0));
		System.out.print(name.charAt(1));
		System.out.print(name.charAt(2));
		System.out.print(name.charAt(3));
		System.out.print(name.charAt(4));
		System.out.print(name.charAt(5));
		System.out.print(name.charAt(6));
		System.out.print(name.charAt(7));
		System.out.print(name.charAt(8));
		System.out.print(name.charAt(9));
		System.out.print(name.charAt(10));
		System.out.print(name.charAt(11));
		System.out.print(name.charAt(12));
		System.out.print(name.charAt(13));
		System.out.print(name.charAt(14));
	}

}
