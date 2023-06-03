package javasessions;

import java.util.Scanner;

public class FindLargestnumberPractices {

	public static void main(String[] args) {
		// Conditional Operators:

//Find out the greatest number out of three different given numbers:

//Input the 1st number: 25 

//Input the 2nd number: 78 

//Input the 3rd number: 87
		//int a=25, b=78,c=87;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number:  ");
		int a =sc.nextInt();
		
		System.out.println("Input the second number: ");
		int b=sc.nextInt();
		
		System.out.println("Input the third number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The greatest: "+a);
		}else if(b>a && b>c) {
			System.out.println("The greatest: "+b);
		}else {
			System.out.println("The greatest: "+c);
		}
		
		
		
		
		

	}

}
