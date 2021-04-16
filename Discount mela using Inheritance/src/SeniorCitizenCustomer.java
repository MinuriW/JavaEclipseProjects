
public class SeniorCitizenCustomer extends Customer{
	
	public SeniorCitizenCustomer() {
		super();
	}
	double generateBillAmount(Double amount) {
		return (amount - (amount * 0.12));
	}

}
