package SuperKeyWord;

public class ChildClass extends BaseClass {

	int interestRate = 10;

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		System.out.println(cc.interestRate);
		cc.showmeInterestRateFromPvtBank();
	}

	public void showmeInterestRateFromPvtBank() {

		showmeInterestRate();
		System.out.println("Current Int Rate from Private Bank is " + super.interestRate);
	}

	public void showmeInterestRate() {
		
		
		System.out.println("Im in child class Current Int Rate from RBI is "+interestRate);
	}
}
