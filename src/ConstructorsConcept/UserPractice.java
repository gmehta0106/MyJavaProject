package ConstructorsConcept;

public class UserPractice {
	private String age;
	private String name;
	private String address;

	public UserPractice(String age, String name) {
		this.age = age;
		this.name = name;
	}

	public UserPractice(String age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static void main(String[] args) {
		UserPractice obj = new UserPractice("20", "Tom");
		System.out.println(obj.age + " " + obj.name);

		UserPractice obj1 = new UserPractice("20", "Tom", "1212");
		System.out.println(obj1.name + " " + obj1.age + " " + obj1.address);
	}

}
