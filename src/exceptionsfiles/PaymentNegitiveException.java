package exceptionsfiles;

public class PaymentNegitiveException extends Exception {
	
	/*public PaymentNegitiveException() {
		System.out.println("Error - Negitive Payment");
	}*/
	double x;
	public PaymentNegitiveException(double a) {
		//System.out.println("Stupid - This is negitive value");
		this.x=a;
	}
	
	public String toString() {
		return x + " is a negitive value";
	}
}
