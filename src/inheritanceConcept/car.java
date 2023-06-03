package inheritanceConcept;

public class car extends Vehicle {

	// car has some methods or properties

	public void start() {
		System.out.println("Car start....");
	}

	public void stop() {
		System.out.println("Car Stop....");
	}

	public void refile() {
		System.out.println("Car refile....");
	}

	@Override
	public void petrolEngine() {
		System.out.println("Car petrolEngine method ... ");
	}
}
