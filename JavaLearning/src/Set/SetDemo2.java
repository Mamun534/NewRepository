package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

	Set<String> value = new HashSet<>();

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
