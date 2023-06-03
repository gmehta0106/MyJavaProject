package AbstractConcept;

public class LoginPage extends Page{

	//if you don't have the constructor then java will add 
	//hidden default constructor 
	
	
	@Override
	public void title() {
		System.out.println("title of login page");
		}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");
	}
	@Override
	public void CalculatePageTimeload() {
		System.out.println("page time out ...5 sec");
	}
	
	public void forgotPassword() {
		System.out.println("Forgot PWD");
	}
	

}
