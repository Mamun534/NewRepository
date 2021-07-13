package CompilePolymorphism;

public class CompileDemoMainRun {

	public static void main(String[] args) {
		
		Method_over_Loading ml = new Method_over_Loading();
		
		ml.add(45);
		ml.add(50, 50);
		ml.add(10, 20, 30);
		ml.add(24.50, 24.50);
		ml.add(98, 1.50);
		ml.add(10.20, 20);
	}

}
