package Assignments;

public class MethodsConcept {

	public int add(int a, int b) {
		System.out.println("Sum of 2 numbers enterd by user:");
		int sum = a + b;
		return sum;
	}

	public int multiplication(int a, int b) {
		System.out.println("Multiplication of two numbers enterd by user:");
		int multi = a * b;
		return multi;
	}

	public int subtraction(int a, int b) {
		System.out.println("Subtraction of 2 nums enterd by user:");
		int sub = a - b;
		return sub;
	}

	public int Division(int a, int b) {
		System.out.println("Division of 2 nums enterd by user:");
		int div = a / b;
		return div;
	}

	public double product(double a, double b) {
		System.out.println("Product of 2 double number enterd by user:");
		double prod = a * b;
		return prod;
	}

	public int max(int max) {
		System.out.println("Maximum number entered by user");
		int num;
		return max;
	}

	public int min(int min) {
		System.out.println("Minimum number entered by user");
		int num2 = min;
		return min;
	}

//	public int numbers(int num1, int num2, int num3) {
//		System.out.println("Enter three numbers");
//		int num;
//		if(num1 > num2 && num1>num3) {
//			System.out.println(num1+ " :is Max number");
//		}else if (num2>num1 && num2>num3) {
//			System.out.println(num2+ " :is Maximum number");
//		}else 
//			System.out.println(num3 + "is max number");
//		return numbers(num1, num2, num3);
//	}

	public static void main(String[] args) {
		// 1.Write a program to print the addition/subtraction/division/multiplication
		// of two numbers entered by user by defining your own method
		MethodsConcept obj = new MethodsConcept();
		int result = obj.add(10, 20);
		System.out.println(result);

		int multiResult = obj.multiplication(10, 20);
		System.out.println(multiResult);

		int sub = obj.subtraction(100, 99);
		System.out.println(sub);

		int div = obj.Division(50, 5);
		System.out.println(div);

		// 2. Define a method that returns the product of two double numbers entered by
		// user.
		double prod = obj.product(45.0, 9.0);
		System.out.println(prod);

		// 3.Write a program to print the circumference and area of a circle of radius
		// entered by user by defining your own method. 

		// 4. Define two methods to print the maximum and the minimum number
		// respectively among three numbers entered by user.
		System.out.println("------------------------");

//		int max = obj.numbers(100, 10, 555);
//		System.out.println(max);

	}

}
