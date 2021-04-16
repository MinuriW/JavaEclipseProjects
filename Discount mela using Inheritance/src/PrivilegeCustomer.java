
public class PrivilegeCustomer extends Customer{
	
	public PrivilegeCustomer() {
		super();
	}
	double generateBillAmount(Double amount) {
		return (amount - (amount * 0.3));
	}
	

}
