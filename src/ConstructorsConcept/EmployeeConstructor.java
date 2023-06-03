package ConstructorsConcept;
//1.Constructor will be restrict the unnecessary object creation
//2. Constructor can be initialize the class variable also
public class EmployeeConstructor {
	//class variables
	String name;
	int age;
	double Salary;
	
	public EmployeeConstructor() {//0 parameter default constructor  
		System.out.println("Const....");
	}
	//overload the constructor
	public EmployeeConstructor(int i) {// parameterize constructor with 1 param and local variables 
		System.out.println("1 param constructor... " + i);
	}
	public EmployeeConstructor(int i, String p) {// parameterize constructor with 2 param
		System.out.println("2 param constructor... " + i);
	}
	
	
	public static void main(String[] args) {
		EmployeeConstructor obj = new EmployeeConstructor();
		obj.name="tom";
		obj.age=20;
		obj.Salary =12.33;
		EmployeeConstructor obj1 = new EmployeeConstructor(10);//object to call 1 param constructor 
		EmployeeConstructor obj2 = new EmployeeConstructor(20, "Testing");//object to call 2 param constructor
		
		//if we have restriction to create object or we put this restriction to solve this problem need to create an constructor 
		//Create constructor inside the class body
		//constructor name is as same as the class name
		//constructor cannot have any return value means ---- no void and return
		//But in function may or may not return 
		//Constructor will be called in the moment when you create an object 
		//to call the constructor no need to create an object seprately 
		

	}

}
