package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println(i);//execute at once means constant time and it will pronounce with Big O(1)// write big O

		String name ="Tom";
		System.out.println(name);//O(1)
		
		int n=100;
		for(int p=1; p<=n; p++) {
			System.out.println(p);
		}
	}//1+n+n+n++>3n+1--->Linear equation 
	//3n+1--> 3n -->O(n)
	//remove 1 because p-1 is a constant part
	//n is 100

}
