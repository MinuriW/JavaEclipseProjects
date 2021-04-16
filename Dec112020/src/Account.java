
public class Account {
	private int accNo; //private variable can be accessed within class only
	private String accHolderName;
	private double balance;
	private int pin;
	
	public Account(int accNo, String accHolderName, double balance, int pin) 
	{
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance=balance;
		this.accNo=accNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void deposit(double amt){
		balance+= amt;
		System.out.println("Transaction successful. Current Balance:" + balance);
	}
	
	public double withdraw(double amt) {
		if(balance>=amt) {
			balance=amt;
			return amt;
		}
		else {
			System.out.println("Insufficient funds.");
		}
		return 0;
	}
	
	public void balEnq() {
		System.out.println("Current Available Balance:" + balance);
	}
	
	public void accDetails() {
		System.out.println("Account name:" + accNo);
	}
	
}
