package OOP_Encapsulation;

public class Browser {
public void lanchBrowser() {
	System.out.println("Lanching the browser....");
	checkBrowserVersion();
	checkOSCompatiblity();
	checkRAM();
	checkCPU();
	System.out.println("Browser is lanched....");
	
	
	
}
private void checkBrowserVersion() {
	System.out.println("check the browser version....");
}
private void checkOSCompatiblity() {
	System.out.println("check OSCompatibilty....");
}
private void checkRAM() {
	System.out.println("check the RAM....");
}
private void checkCPU() {
	System.out.println("check the CPU....");
}

}
