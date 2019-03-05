package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}
	
	public static int fact(int n)
	{
		int b=1;
		
		for(int i=1;i<=n;i++)
		{
			b=b*i;
		}
		return b;
	}

}
