package javasessions;

public class mathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(4/2);
		System.out.println(4+2);
		System.out.println(4-2);
		System.out.println(4*2);
		
		System.out.println(9/3);
		System.out.println(9/2);//consider as int hence print 4 not 4.5
		System.out.println(9.0/2);//has floating number hence print 4.5
		System.out.println(9/2.0);//has floating number hence print 4.5
		System.out.println(9.0/2.0);
		System.out.println((float)9/2);
		System.out.println(9.0/0);//whenever u divided by floating value by 0 always give u infinite here 
		//System.out.println(9/0);//"main" java.lang.ArithmeticException: / by zero
		//System.out.println(0/0);//"main" java.lang.ArithmeticException: / by zero
		System.out.println(9/0.0);//infinity
		System.out.println(9.0/0.0);//infinity
		System.out.println(9.0/0.0);//not a number "nan"
		System.out.println(0.0/2.0);//0.0
		//System.out.println(9/0);
		 System.out.println((float)9/0);//Infinity
		 System.out.println(0.0/0);//NaN
		 System.out.println(0/0.0);
		 System.out.println(9/0.0);
		 System.out.println('a'/2);
		 System.out.println(9%3);//print the remainder
		 System.out.println(9%2);//1
		 System.out.println(100%5);
		 System.out.println(8%2);
		 
	}

}
