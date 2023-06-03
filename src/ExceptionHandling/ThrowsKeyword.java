package ExceptionHandling;

public class ThrowsKeyword {//never use throws keyword in your framework as it will not handle the exception 

	public void m1()throws ArithmeticException {
		System.out.println("m1 method");
		m2();
	}
	public void m2()throws ArithmeticException {
		System.out.println("m2 method");
		try {
			m3();
		}catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		
	}
	public void m3() throws ArithmeticException{//we can exception with using throws keyword
		// throws keyword always use to throw the exception with specific method so it should be written after the method name
		//but throws is just throwing the exception but not handling it
		System.out.println("m3 method");
		int i=9/0;
	}
	//no one is responsible the handle the exception so its main method responsibility but main method can not handle itself and JVM is also not handle it
	//so we need to write try and catch block in m2()
	
	//main method never handle the exception 
	public static void main(String[] args)throws ArithmeticException {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye");

	}

}
