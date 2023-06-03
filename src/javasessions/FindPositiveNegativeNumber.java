package javasessions;

import java.util.Scanner;

public class FindPositiveNegativeNumber {

	public static void main(String[] args) {
		// Input number: 35 -- positive number
		//Input number: -11 -- negative number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num+ " is positive number");
		}else if(num<0) {
			System.out.println(num+ " is negative number");
		}else 
			System.out.println("this number is zero");
	}

}
