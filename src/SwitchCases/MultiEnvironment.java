package SwitchCases;

public class MultiEnvironment {

	public static void main(String[] args) {
	
		String MultiEn = "Dev";
		
	
		switch (MultiEn) {
		
		case "Dev":
			System.out.println("Inside Dev environment");
			break;
		case "QA":
			System.out.println("Inside QA environment");
			break;
		case "Prod":
			//if (MultiEn.trim().equalsIgnoreCase("Prod")) 
			//System.out.println("PASS");
			System.out.println("Inside prod environment ");
			break;
		default:
			System.out.println("Pls pass right environment");
		}
//Q how to use equalsIgnoreCase with switch case 
	}

}
