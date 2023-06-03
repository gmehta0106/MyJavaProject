package ConstructorsConcept;

public class User {
	String name;
	String lastName;
	String phone;
	String emailID;
	String password;
	
	
	//AC: PO
	//User can be created if you have:
	//FN, LN
	//FN, LN, EmailID
	//FN, LN, password, phone
	//FN, LN, emailID, phone, password
	
	public User(String name, String lastname) {
		this.name=name;
		this.lastName=lastname;
	}
	public User(String name, String lastName, String emailID) {
		this.name =name;
		this.lastName = lastName;
		this.emailID=emailID;
	}
	public User(String name, String lastName, String phone, String password) {
		this.name =name;
		this.lastName = lastName;
		this.phone = phone;
		this.password=password;
		}
	public User(String name, String lastName, String password, String phone, String emailID) {
		this.name =name;
		this.lastName = lastName;
		this.password = password;
		this.phone=phone;
		this.emailID=emailID;
		
		}

	public static void main(String[] args) {
		User u =new User("Tom", "peter");
		System.out.println(u.name+" "+ u.lastName);
		
		User u1 =new User("bill", "peter", "abc@gmail.com");
		System.out.println(u1.name+" "+ u1.lastName+ u1.emailID);
		
		User u2 = new User("bb", "vr", "45454555", "iouoiuoi");
		System.out.println(u2.name+ " "+ u2.lastName+ " "+ u2.phone+ " "+ u2.password);
		
		

	}

}
