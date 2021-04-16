class Account{
	
	private String holderName;
	private long accNumber;
	private String IFSCCode;
	private long contactNumber;
	
	public Account(String holderName, long accNumber, String IFSCCode, long contactNumber) {
		
	}
	public void display()	{
		 System.out.println("HolderName : " + getHolderName());
		 System.out.println("Account Number : "+getAccNumber());
		 System.out.println("Account Number : "+getAccNumber());
		 System.out.println("IFSCCode : "+getIFSCCode());
		 System.out.println("ContactNumber : "+getContactNumber());
		
		
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}


	public long getAccNumber() {
		return accNumber;
	}


	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}


	public String getIFSCCode() {
		return IFSCCode;
	}


	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}


	public long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

}