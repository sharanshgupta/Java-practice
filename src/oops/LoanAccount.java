package oops;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Setting rate from LoanAccount Class.");
	}

	public void setTerm(int terms)
	{
		System.out.println("Setting the term as " + terms + " years.");
	}
	
	
}
