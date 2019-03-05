package oops;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Savings");
		
		acc1.setName("Sharansh");
		System.out.println("Using getter to fetch name - " + acc1.getName());
		acc1.setSsn("123123");
		System.out.println("Using getter to fetch ssn - " + acc1.getSsn());
		acc1.setRate();
		
		acc1.deposit(3000);
		acc1.deposit(3000);
		acc1.deposit(3000);
		acc1.withdraw(3000);
		
		acc1.accountnumber="12345";
		
		//Demo for Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.checkBalance();
		cd1.compound();
		
	}

}
