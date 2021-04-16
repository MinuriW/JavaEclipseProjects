public class PremiumStall implements Stall{
	String stallName;
	int cost;
	String ownerName;
	int projector;
	
	PremiumStall(){}
	PremiumStall(String stallName, Integer cost, String ownerName, Integer projector){
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;	
	}
	public void display() {
		System.out.println("Stall Name:"+ getStallName());
		System.out.println("Cost:" +  getCost() +".Rs");
		System.out.println("Owner Name:" + getOwnerName());
		System.out.println("Number of Projectors:" + getProjector());
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

}
