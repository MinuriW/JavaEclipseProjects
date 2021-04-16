package Bank;

public interface DebitInterest extends Interest{
	public double deductMonthlyInt(double amount);
	public void deductHalfYrlyInt();
	public void deductAnnualInt();
}
