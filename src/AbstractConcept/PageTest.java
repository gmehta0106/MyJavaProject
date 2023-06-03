package AbstractConcept;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.displayLogo();// i can inherit but cannot overload
		lp.title();
		lp.url();
		lp.forgotPassword();
		lp.CalculatePageTimeload();

		System.out.println("-----------------------");

		SearchPage sp = new SearchPage();
		sp.title();
		sp.url();
		sp.displayLogo();

		System.out.println("-----------------------");

		Page p = new LoginPage();// Top casting to access page class //access all overridden methods and parent
								// class individual method but cannot access child class individual methods

		p.title();
		p.url();
		p.CalculatePageTimeload();
		p.displayLogo();

		System.out.println("-----------------------");

		Page.footer();// Call static method with the class name
		LoginPage.footer();//it will also call page class method as LoginPage class does not have individual footer method
		SearchPage.footer();//it will also call page class method as LoginPage class does not have individual footer method
	}

}
