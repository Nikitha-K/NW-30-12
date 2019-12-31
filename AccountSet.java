package nikitha;

public class AccountSet {
	protected int accno;
	protected String custname;
	protected double balance;
	public int length;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountSet(){
		
	}

	public AccountSet(int accno, String custname, double balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.balance = balance;
	}
	
	

}
