package Assignments;

//use case to fill mandatory fields in registration form
public class UserConst {
	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;

//Acceptance criteria-AC
//user can be registration if you have below condition:
//FN, LN
//FN,LN,EMAIL ID
//FN
//FN, LN, PASSWORD, phone
//FN, LN, EMAIL ID, PHONE, PASSWORD, CITY
	public UserConst(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserConst(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public UserConst(String firstName) {
		this.firstName = firstName;
	}

	public UserConst(String firstName, String lastName, String password, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
	}

	public UserConst(String firstName, String lastName, String emailId, String phone, String password, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}

	public static void main(String[] args) {
		
		UserConst u1= new UserConst("Tom");
		System.out.println();
		

//		UserConst obj = new UserConst("Tom", "peck");
//		System.out.println(obj.firstName + " " + obj.lastName + " ");
//
//		UserConst e = new UserConst("jim", "cock", "jimcock@gamil.com");
//		System.out.println(e.firstName + " " + e.lastName + " " + e.emailId);

	}

}
