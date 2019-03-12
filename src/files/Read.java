package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define file(path) that/from we want to read.
		String filename = "D:\\Misc\\Files\\read.txt";

		// Create file in Java
		File file = new File(filename);
		String text=null;

		try {
			// Open the file
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Read the file
			text = br.readLine();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error! Your file not found.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error! Could not read data");
			e.printStackTrace();
		}
		System.out.println(text);

	}

}
