package SingleTone;

public class EagerInitialization {
	
	// Instance will be created at load time...
	
	private static EagerInitialization obj = new EagerInitialization();
	
	public String string;

	// Creating private constructor....
	
	private EagerInitialization() {
		
		string = "Welcome to the single Tone Pattren Java";
	}

	// Declaring static method....
	
	public static EagerInitialization getInstance() {
		
		return obj;
	}

	public static void main(String args[]) {
		
		EagerInitialization text = EagerInitialization.getInstance();
		
		// original string
		
		System.out.println("Original String:");
		System.out.println(text.string);
		
		// text in upper case...
		
		System.out.println("String in Upper Case:");
		text.string = (text.string).toUpperCase();
		System.out.println(text.string);
	}
}