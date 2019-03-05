package basics;

public class NumberCalc {
	
	public static void main(String[] args)
	{
		System.out.println("Program is starting.");
		printName();
		int numA = 5;
		int numB = 10;
		addNumbers(numA,numB);
		System.out.println("The multiplication of numA and numB is " + multiplyNumbers(numA, numB));
		
	}
	
	static void printName()
	{
		System.out.println("My name is Sharansh");
	}

	static void addNumbers(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum is " + sum);
	}
	
	static int multiplyNumbers(int a, int b)
	{
		int mul = a * b;
		return mul;
	}
}
