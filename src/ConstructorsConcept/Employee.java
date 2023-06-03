package ConstructorsConcept;

public class Employee {
	//class variables
	String name;
	int age;
	double salary;
	//Const..
	//name is as same as the class name
	//cannot have any return value  
	//no return type
	//const... will be called when you create the object 
	//Const overloading also overload like method
	//const..restrict unnessary obj creation  
	public Employee() {
		System.out.println("default const...where we pass no value");
	}
	public Employee(int i) {
		System.out.println("1 param const..." + i);
	}
	
	public Employee(int i, int a) {
		System.out.println("2 param const..." + i+a);
	}

	public static void main(String[] args) {

		 Employee obj = new Employee();
		 Employee obj1 = new Employee(10);
		 Employee obj2 = new Employee(10+20);
		 

	}

}
