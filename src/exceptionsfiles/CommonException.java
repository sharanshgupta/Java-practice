package exceptionsfiles;

public class CommonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		
		// 1. Identify the potential problem area
		// 2. Surround by try-catch block
		
		try {
			int c=a/b;	
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
			System.out.println(e.toString());
		}
		System.out.println("Program Continues");
		
		//New potential error area.
		String[] states = {"DL", "HR", "MP", "KA"};
		try
		{
		for(int i=0; i<=states.length;i++)
		{
			System.out.println(states[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Index is outside of array");
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Program completed");
		}
	}
	
	
}