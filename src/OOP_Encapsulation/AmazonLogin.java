package OOP_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		// registration done:
		LoginPage lp = new LoginPage("pooja@gamil.com", "pooja@123");

		// doLogin method:
		lp.doLogin(lp.getUserName(), lp.getPassword());

		// reset pwd:
		lp.setPassword("pooja@456");
		lp.doLogin(lp.getUserName(), lp.getPassword());

		// new user Tom wants login now:
		LoginPage lp1 = new LoginPage("Tom@gmail.com", "tom@123");
		//login:
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());

	}

}
