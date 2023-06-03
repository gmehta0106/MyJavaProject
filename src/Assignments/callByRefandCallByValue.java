package Assignments;

public class callByRefandCallByValue {
	String name;
	int age;

	public void add(int a, int b) {
		System.out.println("(call by obj ref) or non static to static method arguments are 20+30: " + (a + b));
		getBrowsers();// N-static --N-static in heap memory
		multiplication();
	}

	public int multiplication() {
		int a = 10;
		int b = 2;
		int result = a * b;
		System.out.println("Multiplication of a*b: " + result);
		return result;

	}

	public void getEmpInfo(callByRefandCallByValue t2) {
		t2.name = "Tom";
		t2.age = 20;
		System.out.println("non static to static or call by obj: " + name);// Tom
		System.out.println("non static to static or call by obj: " + age);// 20
		add(11, 22);// non static to non static - call by value
		// multiplication();
		getBrowsers();
	}

	public void getBrowsers() {
		String browser = "Chrome";
		System.out.println("non-static to non-static method in heap memory: " + browser);
		// multiplication();

	}

	public static void main(String[] args) {
		callByRefandCallByValue obj = new callByRefandCallByValue();
		obj.add(20, 30);// call by value
		obj.getEmpInfo(obj); // call by reference by passing the obj reference
		// System.out.println(obj.name);//tom
		// System.out.println(obj.age);//20

		obj.name = "Riya";
		obj.age = 30;

		System.out.println("Assigned new value to name variable in non static to static or call by obj method " + obj.name);// riya
		System.out.println("Assigned new value to age variable in non static to static or call by obj method " + obj.age);// 30
		System.out.println(obj.name);// print riya
		obj.getEmpInfo(obj);// "print Tom/20 as call by reference
		System.out.println("value replaced again in memory from riya to TOM: " + obj.name);
		System.out.println("value replaced again in memory from 30to20: " + obj.age);

	}

}
