package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private String city;
	private double salary;
	//by using constructor 
	public Employee(String name, int age, String city, double salary) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}
//Getter and Setter
	public void setName(String name) {// method name could be anything
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public int getAge() {
		return age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}
