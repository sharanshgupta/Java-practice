package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		doMath(5,0);
		System.out.println("Program Continues");
	}

	public static void doMath(int a, int b) {
		// TODO Auto-generated method stub
		answer(a,b);		
	}

	public static double answer(int x, int y) {
		// Catch Error here
		return x/y;
	}

}
