class HPVISACard extends VISACard{
   
   public HPVISACard() {
    	super();
	}

	public double computeRewardPoints(String type, double amount) {
		if(type.equals("Fuel")) {
			return super.computeRewardPoints(type, amount) + 10;
		}
		else {
			return amount*0.01;
		}
	}
}
