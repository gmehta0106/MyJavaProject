package ConstructorsConcept;

public class EmployeeTest {
String name;
int age;
double salary;
//hidden constructor /default const...

public EmployeeTest(String name) {
	this.name  = name;
}

public EmployeeTest(String name, int age) {
	this.name  = name;
	this.age = age;
}
public EmployeeTest(String name, int age, double salary) {
	this.name  = name;
	this.age = age;
	this.salary = salary;
}

	public static void main(String[] args) {
		
		EmployeeTest obj = new EmployeeTest("Tom");
		System.out.println(obj.name);
		
		EmployeeTest obj1 = new EmployeeTest("cat", 99);
		System.out.println(obj1.name +" "+ obj1.age );
		obj1.salary = 25.55;//updated value later without creating obj reference again
		System.out.println(obj1.name +" "+ obj1.age+ " "+ obj1.salary );
	
	EmployeeTest obj2 = new EmployeeTest("Bill", 78, 55.5);
	System.out.println(obj2.age + " "+obj2.name + " "+ obj2.salary);
	}

}
