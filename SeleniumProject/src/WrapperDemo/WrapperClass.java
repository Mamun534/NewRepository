package WrapperDemo;

public class WrapperClass {

	public static void main(String[] args) {

		// How to convert String value to int values.......
		
		String price1 = "540";
		String price2 = "460";

		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);

		int sum = p1 + p2;

		if (sum == 1000) {

			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
