package OOPSConcepts;

public class noInputNoReturn {
	public void getMarks()
	
	 {

	int maths = 100;
	int sci=	95;
	int eng =  85;
	int totalMarks = maths+sci+eng;
	System.out.println("Total marks: "+totalMarks);}
	

	public static void main(String[] args) {
		
		noInputNoReturn obj= new noInputNoReturn();
		obj.getMarks();
		
		
	}

}
