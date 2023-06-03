package AbstractConcept;

public abstract class Page {
	// cannot create the object of abstract class
	// same is in Interface

	// method: every page title of the page is different, let the page class decide
	// what will the method
	
	public Page() {//we can create constructor of abstract class 
	System.out.println("Page class const....");				//and this const. will be called when we create an object of child class 
	}
	public abstract void title();// write abstract keyword mandatory in abstract class

	public abstract void url();

	public void CalculatePageTimeload() {
		System.out.println("page time out ...10 sec");
	}

	public final void displayLogo() {//logo will be same throughout the pages 
		System.out.println("display logo of Page class");
	}
	
	public static void footer() {
		System.out.println("Footer method ....of page abstarct class");
	}
	
}
