package oops;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanAccount la1 = new LoanAccount();
		
		la1.setRate();
		la1.setTerm(10);
		
		//Polymorphism - where we are pointing
		
		IRate account1 = new LoanAccount();
		account1.setRate();
		
	}

}
