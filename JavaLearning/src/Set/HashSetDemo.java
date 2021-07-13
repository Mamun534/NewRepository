package Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> value = new HashSet<>();

		value.add("Java");
		value.add("Selenium");
		value.add("1");
		value.add("Mukesh");
		value.add("Man");
		value.add("22");
		value.add("abc");
		value.add("Cucumber");

		for (String e: value) {

			System.out.println(e);
		}

	}

}
