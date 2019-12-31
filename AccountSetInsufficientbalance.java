package nikitha;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("insufficient balance, please try again");
	}
	

}
