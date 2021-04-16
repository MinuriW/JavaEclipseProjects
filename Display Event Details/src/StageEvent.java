
public class StageEvent extends Event {
	private int noOfSeats;

	StageEvent(String name, String detail, String type, String organiser, int noOfSeats){
		super(name, detail, type, organiser);
		super.display();
		this.noOfSeats=noOfSeats;
	}
	
	public void display() {
		System.out.println("No of Seats: " + noOfSeats);
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
}
