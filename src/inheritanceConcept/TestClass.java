package inheritanceConcept;

public class TestClass {// behaving like a runner class for me

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited method
		b.refile();// inherited method
		b.autoParking();// Individual method of BMW
		b.engine();// inherited from grand parent class
		b.petrolEngine();// Overridden from the CAR

		System.out.println("----------");
		car c = new car();
		c.start();
		c.stop();
		c.refile();
		c.engine();
		c.petrolEngine();
		System.out.println("----------");
		Audi a = new Audi();
		a.theftSaftery();
		System.out.println("----------");
		Truck t = new Truck();
		t.loading();// we can access truck method individually
		System.out.println("----------");
		car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refile();
		c1.petrolEngine();
		// c1.autoParking();//method is not allowed because of reference type check is
		// failed

		// down casting
		// parent class obj can be refered by child class ref variable
		// BMW b1 =(BMW) new car();//it will through error in run time as
		// classCastException
		System.out.println("----------");
		Vehicle v1 = new BMW();
		v1.engine();
		v1.petrolEngine();
		v1.start();

	}

}
