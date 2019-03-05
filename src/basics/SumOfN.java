package basics;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(sum(5));
		
	}
	
	public static int sum(int a)
	{
		int b = 0;
		
		for(int i=1;i<=a;i++)
		{
			b=b+i;
		}
		return b;
	}

}
