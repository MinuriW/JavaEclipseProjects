class SavingAccount extends Account{
	double 	interestRate;
	
	public SavingAccount(String holderName, long accNumber, String IFSCCode, long contactNumber, double interestRate) {
		super(holderName,accNumber,IFSCCode,contactNumber);
		this.interestRate = interestRate;
				
	}
	public void display( ){
		System.out.println("Interest Rate: "+ getInterestRate());

	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}