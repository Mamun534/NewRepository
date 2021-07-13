package ClassDemo;

public class stringRemov {

	public static void main(String[] agrs) {

		String name = "Bangladesh";
		char charRemove = 'a';
		System.out.println(name);
		System.out.println(RemovecharacterFromString( name, charRemove));
	}

	public static String RemovecharacterFromString(String myString, char charRemove) {
		
		StringBuilder sb = new StringBuilder();

		char[] removeString = myString.toCharArray();

		for (int i = 0; i < removeString.length; i++) {

			if (removeString[i] == charRemove) {

			}
			else {
				sb.append(removeString[i]);
			}
		}
			return sb.toString();
	}

}
