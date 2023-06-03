package ExceptionHandling;

public class MultipleTryCatchBlock {

	int age;//we can write multiple try catch block but to handle all try catch block in one class we created this class

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		// if we don't write the try and catch block it will immediately terminate the
		// program
		// this is run time exception and its unchecked exception
		try {
			int i = 9 / 3;
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.age=20;
		}
		// we can handle the exception with "Throwable e", "Exception e",
		// "RuntimeException e", "ArithmeticException e" but we cannot write super class
		// "Object e"
		catch (ArithmeticException e) {// e is the reference of the class
			System.out.println("AE is coming....");// good idea to print message to read the code
			e.printStackTrace();// to know what type of exception is coming and on which line its coming
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
			
		}

	}

}

