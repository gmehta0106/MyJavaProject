package OOPSConcepts;

public class StackMemory {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		//if m1() then output will be StackOverflow exception 
	}

	public static void main(String[] args) {
		StackMemory obj = new StackMemory();
		obj.m1();
		obj.m2();
	}

}
