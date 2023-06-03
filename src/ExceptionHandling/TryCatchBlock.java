package ExceptionHandling;

public class TryCatchBlock {
	int age;//we can write multiple try catch block 

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		try {
			obj.age = 20;
		} // NPE
		catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();

		}

		// if we don't write the try and catch block it will immediately terminate the
		// program
		// this is run time exception and its unchecked exception
		try {
			int i = 9 / 0;
		}
		// we can handle the exception with "Throwable e", "Exception e",
		// "RuntimeException e", "ArithmeticException e" but we cannot write super class
		// "Object e"
		catch (ArithmeticException e) {// e is the reference of the class
			System.out.println("AE is coming....");// good idea to print message to read the code
			e.printStackTrace();// to know what type of exception is coming and on which line its coming
			System.out.println("Bye");
		}

	}

}
