package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double payment=0;
		boolean negpayment=false;
		
		//Get the value
		do {
			//Ask user for input
			System.out.print("Enter the payment amount: ");
			Scanner in = new Scanner(System.in);

			try {
				payment = in.nextDouble();
				if (payment < 0) {		
					throw new PaymentNegitiveException(payment);
				}
				else {
					System.out.println("You have entered amount " + payment);
					System.out.println(negpayment);
					negpayment=false;
				}
			} catch (PaymentNegitiveException e) {
				System.out.println("Error: " + e.toString());
				negpayment = true;
			}
		} while (negpayment);
	}

}
