package Set;

import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> value = new LinkedHashSet<>();

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
