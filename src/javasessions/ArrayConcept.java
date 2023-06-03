package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		int a[]=new int[4];
//		a[0]=200;
//		a[1]=100;
//		a[2]=300;
//		a[3]=900;
//		int len= a.length;
//		System.out.println("length of array:" +len);
//		System.out.println(a[2]);
//		for(int i=0;i<len;i++) {
//			System.out.println(a[i]);
//		}
//		

		//find largest and smallest array
//		int number[]= {-100,-10,24,50,-88,8989,8990};
//		int largest = number[0];
//		int smallest = number[0];
//		for(int i=0;i<number.length;i++) 
//			if(number[i]>largest) {
//	        largest=number[i];
//	        }
//			else if(number[i]<smallest) {
//				smallest=number[i];
//			}System.out.println("Array value: "+ Arrays.toString(number));
//			System.out.println("Largest number: "+ largest);
//			System.out.println("Smallest number: "+ smallest);
			
			String browser[] = {"Chrome", "FireFox", "Safari", "IE" };
			System.out.println(Arrays.toString(browser));
			for(int k=0; k<browser.length;k++)
			if(browser[k].equals("Chrome"))
				System.out.println("from google");
			else if(browser[k].equals("FireFox"))
				System.out.println("from mozrilla");
			else if(browser[k].equals("Safari"))
				System.out.println("From S");
			else
			System.out.println("IEEE");
	}}
		

		
	


