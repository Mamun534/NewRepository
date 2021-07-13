package WrapperDemo;

public class WrapperDouble {

	public static void main(String[] args) {

		// How to convert double value to int values.......

		String price1 = "540.90";
		String price2 = "460.10";

		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);

		double sum = p1 + p2;

		// This is failed...caz the value is not same....

		if (sum == 1000) {

			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
