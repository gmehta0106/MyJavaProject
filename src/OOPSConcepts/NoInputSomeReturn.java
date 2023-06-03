package OOPSConcepts;

public class NoInputSomeReturn {
	public int getMarks() {
		int a=10;
		int b=20;
		int c=30;
		int total = a+b+c;
		System.out.println("Total marks: "+ total);
		return total;
	}

	public static void main(String[] args) {
		
		NoInputSomeReturn t = new NoInputSomeReturn();
	int r=t.getMarks();
	System.out.println("Additional marks: "+ (r+10));
	}

}
