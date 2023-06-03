package javasessions;

public class contiditionalStatements {

	public static void main(String[] args) {
		//nested if
		int number=150;
		if (number<=100) {
			System.out.println("calculating your marks");
		}
		if(number>=90) {
			System.out.println("GRADE A");
			if(number==100) {
				System.out.println("u got 100% scholarship");
			}
			
		}else {
			System.out.println("pls pass the right marks");
		}

		//if -else if
		//whenever you print non-primitive data type like string use .equals method 
		//break is not applicable for the if condition only made for switch case and for loops 
		String browser ="chrome";
		if(browser.equals("chrome")){//always write boolean value in if condition
			System.out.println("Lanch chrome");
			}else if(browser.equals("firefox"))
		{
				System.out.println("Lanch firefox");
		}
			else if(browser.equals("safari")) {
				System.out.println("lanch safari");
			}
			else {
				System.out.println("plz pass the right browser");
			}
	}
	//if 100 conditions are there then we need to write 100 else if and then it will be the code issue 
	//over come to this issue use "switch case"
	

}
