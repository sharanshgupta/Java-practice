package basics;

import java.util.ArrayList;
import java.util.List;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> f = new ArrayList<Integer>();
		
		//f.add(1);
		//f.add(2);
		//System.out.println(f);
		
		for(int i=0;i<5;i++)
		{
			
			if(i==0)
			{
				System.out.println("Hek");
				System.out.println(i);
				//int y=i;
				f.add(i);
			}
			else if(i==1)
			{
				System.out.println("dek");
				System.out.println(i);
				//int y=i;
				f.add(i);
			}
			else {
				//System.out.println(f);
				int x=f.get(i-1)+f.get(i-2);
				f.add(x);
			}
			
		}
		System.out.println(f);
		
	}

}
