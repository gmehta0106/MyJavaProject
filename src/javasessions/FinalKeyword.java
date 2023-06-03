package javasessions;

public class FinalKeyword {

	public static void main(String[] args) {
		//constant value
		int x=10;
		x=20;
		x=30;
		x=40;
		System.out.println(x);
		
		final int days=7;
		//days=10;//not allowed to change the value of final variable
		int sal=days*100;
		System.out.println(sal);
		
		final int DEFAULT_TIME_OUT=10;//always try to write final variable with capital letters with underscore 
		final String LOGIN_PAGE_TITLE="Amazon Login";
		final char GENDER = 'f';
		
		
		

	}

}
