package ConstructorsConcept;

//Purpose of the constructor
//1.Constructor will be restrict the unnecessary object creation like if you dont have the information about employee then u cannot update 
//2. Constructor can be initialize the class variable also
//3. Constructor means construct the object 
public class EmployeeConstructor1 {
	String name;
	int age;
	double salary;

//Use case of constructor - HR application is there or Registration form where we keep updating the employee values
	
	public EmployeeConstructor1(String name) {
		this.name = name;// with this keyword you can access the class variable
	}
	
	public EmployeeConstructor1(String name, int age) {
		this.name=name;
		this.age=age;
		}
	public EmployeeConstructor1(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		}

	public static void main(String[] args) {
		EmployeeConstructor1 obj = new EmployeeConstructor1("Tom");// 1.this object only refer 1 param constructor
		System.out.println(obj.name);// 2.This object only call class variable
										// to solve 1 and 2 points we use "this keyword to assign class variable value
		EmployeeConstructor1 obj1 = new EmployeeConstructor1("Siya", 90);		
		System.out.println(obj1.name + " " + obj1.age+ " "+ obj1.salary);
		obj1.salary = 12.00;
		System.out.println(obj1.name + " " + obj1.age+ " "+ obj1.salary);
		
		EmployeeConstructor1 obj2 = new EmployeeConstructor1("Madhav", 100, 100.0);
		System.out.println(obj2.salary);

	}

}
//Hidden const/default const will be call when u create obj but it will not print something and 
//it will be only only call when u dont have ur own constructor 
