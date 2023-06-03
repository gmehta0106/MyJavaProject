package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		System.out.println(ar);
		
		ArrayList <Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(80);
		marksList.add(99);
		marksList.add(97);
		marksList.add(100);
		System.out.println(marksList.size());
		for(Integer e: marksList) {
			System.out.println(e);
		}
		System.out.println(marksList);
		
		ArrayList <Object> EmpData = new ArrayList<Object>();
		EmpData.add("Tom");
		EmpData.add(35);
		EmpData.add(45000);
		EmpData.add('M');
		EmpData.add("89 jkjk, CA");
		EmpData.add("525");
		//EmpData.add(8, EmpData);//it will give IOB exception 
		System.out.println(EmpData);
		for (Object e : EmpData) {
			System.out.println(e);// we cannot use conditions with for each loop 
		}
		
		ArrayList<String>browsers=new ArrayList<String>();
		browsers.add("Chrome");
		browsers.add("Safari");
		browsers.add("IE");
		browsers.add("FireFox");
		System.out.println("Size: " +browsers.size());
		for (int i=0; i<browsers.size();i++) {
			System.out.println(browsers.get(i));
			
			if(browsers.get(i).equals("Chrome")) {
				System.out.println("Lanch the chrome browser");
			}
			else if (browsers.get(i).equals("Safari")) {
				System.out.println("Lanch the safari browser");
			}else if (browsers.get(i).equals("FireFox")) {
				System.out.println("Lanch the FF browser");
			}else
				System.out.println("IE is depricated");
}}}
