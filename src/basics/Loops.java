package basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colours = {"Red", "Blue", "Black"};
		
		// Do While loop
		System.out.println("Do while loop starts");
		int i=0;
		do{
			System.out.println(colours[i]);
			i++;
		}
		while(i<3);
		
		//While do loop
		System.out.println("While loop starts");
		int n=0;
		while(n<3)
		{
			System.out.println(colours[n]);
			n++;
		}
	
		//For loop
		System.out.println("For loop starts");
		//int k=0;
		for(int j=0;j<3;j++)
		{
			// Do While loop
			System.out.println(colours[j]);
		}
	
	
	}

}
