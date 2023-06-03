package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		//2 int variables
		int a=10;
		int b =20;
		System.out.println(a+b);
		
		//String is a default class and start with capital letter
		//return in "" - is a collection of multiple character 
		
		//2 string variable 
		//string concatenation 
		String x ="hello";
		String y = "Selenium";
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		double c =12.33;
		double d =22.33;
		System.out.println(x+y+c+d);
		
		char g='m';
		char p = 'n';
		
		//https://www.johndcook.com/blog/2022/05/28/how-to-memorize-the-ascii-table/
		//whenever perform a addition on character then it will print ascii value 
		//every programming language use the same ascii value for char maths 
		char t1='a';
		char t2='b';
		System.out.println(t1+t2);
		char t3 = 'z';
		System.out.println("ascii: " +(t1+t2+t3));
		System.out.println(t1);
		System.out.println(t1-t2);
		
		System.out.println("ascii: "+'a');
		System.out.println('a'+'b');
		System.out.println("a+b");
		//range for small letters a-z 97 to 122
		//range for capital A-Z 65 to 90
		//0-9 48 to 57
		System.out.println('$'+'a');
		System.out.println((byte)'a');//recommended as taking 1 byte 
		System.out.println((byte)'$');
		System.out.println((int)'a');//not recommended as taking 4 bytes
		System.out.println((long)'a');//not recommended as taking 8 bytes
		
		int s1=100;
		int s2 = 300;
		System.out.println("value of s1: "+ s1);
		System.out.println("sum is:" +s1+s2);
		System.out.println("sum is:" +(s1+s2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
