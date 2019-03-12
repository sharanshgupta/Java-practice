package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define file(path) that/from we want to read.
		String filename = "D:\\Misc\\Files\\write.txt";
		String message = "Writing data to a file.";

		// Create file in Java
		File file = new File(filename);
		
		
		try {
			//Open the file
			FileWriter fw = new FileWriter(file);
			
			//Write onto the file
			fw.write(message);
			
			//Close resources
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
