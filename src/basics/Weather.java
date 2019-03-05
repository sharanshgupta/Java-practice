package basics;

public class Weather {

	public static void main(String[] args)
	{
		int temperature = 65;
		
		if(temperature < 70)
		{
			System.out.println("Shorts and t-shirt would be perfect for this weather!");
		}
		else if(temperature > 40 && temperature <= 70)
		{
			System.out.println("Jeans and full sleeve t-shirt would be perfect for this weather");
		}
		else if(temperature <= 40)
		{
			System.out.println("Warm clothes would be perfect for this weather!");
		}
	}
}
