package AbstractDemo;

public class HRDepart extends ItDepart {

	public static void main(String[] args) {
		
		// 1st scenario..
		HRDepart hd = new HRDepart();
		hd.goodies();
		hd.work();
		hd.salary();
		hd.bonus();
		
		ItDepart it = new HRDepart();
		
		it.goodies();
		it.work();
		it.salary();
		
		// bonus method i can't access caz object of child class but reference of parents class..
	}

	@Override
	public void salary() {
		
		System.out.println("Salary of the employe $"+1500);
	}
	
	public void bonus() {
		
		System.out.println("This is Bonus for Employe");
	}
}
