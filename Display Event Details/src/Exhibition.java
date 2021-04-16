
public class Exhibition extends Event {
	private int noOfStalls;
	
	Exhibition(String name, String detail, String type, String organiser, int noOfStalls){
		super(name, detail, type, organiser);
		super.display();
		this.noOfStalls=noOfStalls;
	}
	public void display() {
		System.out.println("No of Stalls: " + noOfStalls);
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	
}
