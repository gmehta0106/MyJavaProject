package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser="chrome";
		
		switch (browser) {//write switch then press ctrl + spacebar to get the case statement 
							//key is browser
		case "chrome"://check do we have case with chrome 
			System.out.println("lanch chrome");
			if(10>5) {
				System.out.println("10 is greater then 5");
			}
			break;//break keyword will break entire statement  
		case "firefox"://check do we have case with chrome 
			System.out.println("lanch FF ");
			break;//break keyword will break entire statement  and go to default and it will not go to 1 by 1 all cases
		case "safari"://check do we have case with chrome 
			System.out.println("lanch safari");
			break;
		case "ie"://check do we have case with chrome 
			System.out.println("lanch ie");
			break;
		default://default behaving the else here
			System.out.println("pls pass the right browser");
			break;
		}

	}

}
