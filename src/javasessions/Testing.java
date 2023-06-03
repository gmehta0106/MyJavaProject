package javasessions;

public class Testing {
	//if you have a static block then before main method it will print static method first then main method 
	//we have multiple static method
	//we can run the program if static blocks declare after the main method but best practice is to define always before main method 
	static {
		System.out.println("launch chrome");
	}
	static {
		System.out.println("enter url");
	}

	public static void main(String[] args) {
		System.out.println("bye naveen");

	}

}
