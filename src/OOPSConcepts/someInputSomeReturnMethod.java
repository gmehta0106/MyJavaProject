package OOPSConcepts;

public class someInputSomeReturnMethod {
	public int getMarks(int a,int b, int c) {//parameters
		
		int total = a + b + c;
		System.out.println("Total marks: " + total);
		return total;
	}

	public static void main(String[] args) {
		someInputSomeReturnMethod m1 = new someInputSomeReturnMethod();
		int i = m1.getMarks(20,30,10);//arguments
		System.out.println(i + 20);

	}

}
