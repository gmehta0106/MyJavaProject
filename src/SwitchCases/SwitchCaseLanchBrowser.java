package SwitchCases;

public class SwitchCaseLanchBrowser {

	public static void main(String[] args) {
		String browser = "FF";
		switch (browser) {
		case "Chrome":
			System.out.println("Lanch the chrome browser");
			break;
		case "FF":
			System.out.println("Lanch the FF browser");
			break;
		case "Safari":
			System.out.println("Lanch the safari browser");
			break;
		default:
			System.out.println("Pls pass the right browser");
		}

	}

}
