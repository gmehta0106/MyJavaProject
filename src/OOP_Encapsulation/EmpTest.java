 package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		//cannot access the variables with obj reference as variables are private in nature hence we use getter and setter 
		Employee e1 = new Employee("Tom", 20, "Toronto", 12.22);// by using constructor in Employee class also we can access private variables 
		//GET - retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		
		
		
		//Getter and Setter 
		//PUT - Update - setter are use for update the variable 
//		e1.setName("Aarush");
//		String n1 = e1.getName();
//		System.out.println(n1);
//
//		e1.setAge(20);
//		int a = e1.getAge();
//		System.out.println(a);
//
//		e1.setCity("Toronto");
//		String c = e1.getCity();
//		System.out.println(c);
//		
//		e1.setSalary(12.22);
//		double s =e1.getSalary();
//		System.out.println(s);
	}

}
