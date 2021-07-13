package AbstractDemo;

public abstract class ItDepart implements Employe{
	

	@Override
	public abstract void salary();

	@Override
	public void goodies() {
		
	System.out.println("Laptop");
	
	}

	@Override
	public void work() {
		
		System.out.println("Automotions");
	}

}
