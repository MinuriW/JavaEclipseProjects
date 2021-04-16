package Bank;

public interface LoanAcc extends Account {
	public void repayPrincipal(double amount);
	public void payPrinciple(double amount);
	public void PayPartialPrincipal(double amount);
}
