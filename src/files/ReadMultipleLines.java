package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "D:\\Misc\\Files\\multiplephonenumber.txt";
		String[] phonenum = new String[2];

		File file = new File(filename);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<2; i++) {
				phonenum[i] = br.readLine();
				System.out.println(phonenum[i]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
