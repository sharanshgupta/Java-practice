package basics;

public class NumberSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,5,3,4,2};
		
		System.out.println("Here the numbers to sort - 1, 5, 3, 4, 2");
		
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<4; j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp = numbers[j+1];
					int temp1 = numbers[j];
					numbers[j] = temp;
					numbers[j+1] = temp1;
				}
			}
		}
		
		System.out.println("The sorted string is -");
		for(int k=0; k<5; k++)
		{
			System.out.print(numbers[k] + " ");
		}
		
	}

}
