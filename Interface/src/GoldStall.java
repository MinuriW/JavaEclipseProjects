public class GoldStall implements Stall{
	String stallName;
	int cost;
	String ownerName;
	int tvSet;

	GoldStall(){}
	GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet){
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;	
	}
	
	public void display() {
		System.out.println("Stall Name:"+ getStallName());
		System.out.println("Cost:" +  getCost() +".Rs");
		System.out.println("Owner Name:" + getOwnerName());
		System.out.println("Number of TV sets:" + getTvSet());
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
	public int getTvSet() {
		return tvSet;
	}
	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	
	
}

