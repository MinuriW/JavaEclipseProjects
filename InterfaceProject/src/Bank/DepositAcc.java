package Bank;

public interface DepositAcc extends Account {
	 double withdraw(double amount);
	 double deposit(double amount);
	 double getBalance(double amount);
}
