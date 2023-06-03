package inheritanceConcept;

public class BMW extends car {
//method overriding : is also Poly + Morphism(form) --> runtime polymorphism or dynamic poly..
	// when you have a method in parent class and the same method in child class
	// with the same name
	// with the same number of parameter
	// with the same sequence of parameter
	// with same return also
	// method overriding always between parent and child
	// method overloading within the class

	@Override // good practice to write this annotation to understand the code
	public void start() {
		System.out.println("BMW...start");
	}

	public void autoParking() {
		System.out.println("BMW autoParking");
	}
	
	public void theftSaftey() {
		System.out.println("BMW theftSaftey");
	}

	@Override
	public void petrolEngine() {
		System.out.println("BMW petrolEngine method ... ");
	}

}
