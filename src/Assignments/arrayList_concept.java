package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList_concept {
	//Questions:
	//.........how to remove fifth index value in array literals ask naveen 

	public static void main(String[] args) {
		// 1.Q1: WAP to delete a specific number from the given array
		int ar[]= {1,4,5,2,3,22,31,2};
		System.out.println(Arrays.toString(ar));
		
//		//Q2: Write a program to create a static Array, having following cricket data:
//             name, age, team name, DOB, gender, Strike Rate
//             Try to create multiple Object Arrays for different players 
//				Try to print all the values of each player on the console
		
		//ArrayList......................
		//Q1:Write a Java program to create a new array list
		//add some colors (string) 
        //and print out the colors list
		 String color[]=new String[4];
		 color[0]="Red";
		 color[1]="Blue";
		 color[2]="Orange";
		 color[3]="Pink";
		 System.out.println(color.length);
				 int len = color.length;
				 for(int i=0;i<len;i++) {
					 System.out.println(color[i]);
				 }
				 System.out.println("-----------");
		//Q4:Write a Java program to retrieve an element at a specified index from a given array list.
				 ArrayList ar2=new ArrayList();
				 ar2.add(200);
				 ar2.add("Naveen");
				 ar2.add('M');
				 ar2.add(20.20);
				 ar2.add(true);
				 System.out.println("Size of dynamic object type array: "+ ar2.size());
				 System.out.println(ar2);
				 System.out.println("get value: " +ar2.get(2));
				 System.out.println("add value" +ar2.add("Testing"));
				 System.out.println(ar2);
				 ar2.add(2, 'f');
				 System.out.println(ar2.get(2));
				 System.out.println(ar2);
				 System.out.println("remove 3rd index value: " +ar2.remove(3));
				 System.out.println(ar2);
				 System.out.println("replacing given value with siya: " +ar2.set(1, "Siya"));
				 System.out.println(ar2);
				 
				
				 System.out.println("---------");
				 ArrayList<Integer> ar1 = new ArrayList<Integer>();
				 ar1.add(100);
				 ar1.add(200);
				 ar1.add(300);
				 ar1.add(400);
				 System.out.println(ar1.get(1));
				 
//				 5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
//
//				        
//
//				 6. Reverse this array List:
//
//				 ArrayList<String> studentNames = new ArrayList<String>();
//
//				                 studentNames.add("Varun");
//
//				                 studentNames.add("Reena");
//
//				                 studentNames.add("Naveen");
//
//				                 studentNames.add("Robin");
//
//				                 studentNames.add("Peter");
//
//				 7. Write a Java program to extract a portion of an array list.
//
//				 8. Write a Java program to empty an array list.
//
//				 9. Write a Java program to trim the virtual capacity of an array list the current list size.
//
//				 10. Write a Java program to print all the elements of an ArrayList using the position of the elements
				 
				 
		 
		 
		 
		 
		
		
	
		
		
		
		
	
		
		

	}

}
