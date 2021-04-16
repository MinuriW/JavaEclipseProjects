
public class CurrentAccount extends Account{
	String 	orgName;
	long 	TIN;

public CurrentAccount(String holderName, long accNumber, String IFSCCode, long contactNumber, String orgName, long TIN) {
	super(holderName,accNumber,IFSCCode,contactNumber);
	this.orgName=orgName;
	this.TIN=TIN;
}
public void display( ){
		
	System.out.println("ContactNumber : "+ getTIN());
	System.out.println("Organization Name : " + getOrgName());
		
	}

public String getOrgName() {
	return orgName;
}

public void setOrgName(String orgName) {
	this.orgName = orgName;
}

public long getTIN() {
	return TIN;
}

public void setTIN(long tIN) {
	TIN = tIN;
}


}
