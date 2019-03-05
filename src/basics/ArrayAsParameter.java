package basics;

public class ArrayAsParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,6,4,3};
		System.out.println("Max number in the array is " + max(arr));
		System.out.println("Min number in the array is " + min(arr));
		System.out.println("Average of numbers in the array is " + ave(arr));
	}
	
	public static int max(int[] x)
	{
		int n=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(n<x[i])
			{
				n=x[i];
			}
		}
		return n;
	}
	
	public static int min(int[] x)
	{
		int n=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(n>x[i])
			{
				n=x[i];
			}
		}
		return n;
	}
	public static int ave(int[] x)
	{
		int n=0;
		for(int i=0;i<x.length;i++)
		{
			n=n+x[i];
		}
		return n/x.length;
	}

}
