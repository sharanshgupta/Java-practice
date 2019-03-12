package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "D:\\Misc\\Files\\passwordvalidate.txt";
		String[] passwords = new String[5];

		File file = new File(filename);
		// Reading passwords from file and creating an array for it.
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < 5; i++) {
				passwords[i] = br.readLine();
				//System.out.println(passwords[i]);
			}
			br.close();
			/*for (int i = 0; i < 13; i++) {
				System.out.println(passwords[i]);
			}
			System.out.println("Passwords over");*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Checking for password validation rules
		for (int i = 0; i < 5; i++) {
		try {
				if (!(passwords[i].matches(".*\\d+.*"))) {
					throw new NumberException(passwords[i]);
				}
				if (!(passwords[i].matches(".*[a-zA-Z]+.*"))) {
					throw new LetterException(passwords[i]);
				}
				if (!(passwords[i].matches(".*[!@#$^&]+.*"))) {
					throw new SpecialCharacterException(passwords[i]);
				}
			
		} catch (NumberException e) {
			
		} catch (LetterException e) {
			
		} catch (SpecialCharacterException e) {
			
		}
		
	}

	}
	
}

class NumberException extends Exception {
	public NumberException(String password) {
		System.out.println("Error - " + password + " does not have a number.");
	}
}

class LetterException extends Exception {
	public LetterException(String password) {
		System.out.println("Error - " + password + " does not have a letter");
	}
}

class SpecialCharacterException extends Exception {
	public SpecialCharacterException(String password) {
		System.out.println("Error - " + password + " does not have a special character");
	}
}
