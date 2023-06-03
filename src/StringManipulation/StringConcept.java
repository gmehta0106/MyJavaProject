package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		// String value - stores in SCP-String Constant Pool
		//String literals 
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s==s1);//true
		System.out.println(s==s2);//false
		
		String st=new String("Java");
		String st1=new String("Hello");
		System.out.println(s==st1);//not recomended in String
		System.out.println(s.equals(st1));//this is good 
		
		String st2=new String("Hello");//one more memory object is in heap created
		//always creating the string with String literals 
		
		//QHow many objects are creating in the memory 
		//2 only
		String test= new String("Selenium");//1 ---heap
		test.intern();//1--->SCP
		String t1="Selenium";//0 as its replaced with already available in the SCP
		
		
		
		
		
		
		
		
		

	}

}
