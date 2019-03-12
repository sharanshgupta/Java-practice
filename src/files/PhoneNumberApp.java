package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "D:\\Misc\\Files\\phonenumber.txt";

		String phonenum = null;

		File file = new File(filename);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phonenum = br.readLine();
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

		// This will read a file and retrieve phone number
		// Valid phone number:
		// 10 digits long
		try {
			if (phonenum.length() != 10) {
				throw new TenDigitsException(phonenum);
			}
			System.out.println("Your phone number is " + phonenum);
		} catch (TenDigitsException e) {
			System.out.println("Error!");
		}

	}

}

class TenDigitsException extends Exception {
	public TenDigitsException(String num) {
		System.out.println("Your phone number *" + num + "* is not of 10 digits");
	}
}