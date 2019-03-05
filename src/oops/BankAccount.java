package oops;

public class BankAccount implements IRate {

	String accountnumber=null;
	private static final String routingnumber = "222";
	private String name;
	private String ssn;
	String accounttype;
	int balance=0;
	
	BankAccount()
	{	}
	BankAccount(String accType)
	{
		System.out.println("Account Name Type - " + accType);
	}
	BankAccount(String name, int deposit)	
	{
		System.out.println("Initial Deposit of " + deposit);
		if(deposit<1000)
		{
			System.out.println("Minimum deposit should be $1000");
		}
		else
		{
			System.out.println("You have deposited $" + deposit + " in your account.");
		}
	}
	
	//Getters and setter
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public String getSsn()
	{
		return ssn;
	}
	public void setSsn(String ssn)
	{
		this.ssn = ssn;
	}
	
	//Interface Methods
	public void setRate()
	{
		System.out.println("Setting rate.");
	}
	
	
	void deposit(int deposit)
	{
		if(deposit<1000)
		{
			System.out.println("Minimum deposit should be $1000");
		}
		else
		{
			balance = balance + deposit;
			System.out.println("You have deposited $" + deposit + " in your account.");
			showactivity("Deposit");
			System.out.println("Your new balance is $" + balance);
		}
	}
	
	void withdraw(int withdraw)
	{
		balance = balance - withdraw;
		System.out.println("You have withdrawn $" + withdraw + " in your account.");
		showactivity("Withdraw");
		System.out.println("Your new balance is $" + balance);
	}
	
	private void showactivity(String activity)
	{
		System.out.println("Showing your activity - " + activity);
	}
	
	void checkBalance()
	{
		System.out.println("Balance");
	}
	
	void status()
	{
		
	}
	
}
