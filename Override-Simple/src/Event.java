public abstract class Event{
	protected String name;
	protected String detail;
	protected String ownerName;
	
	public Event() {}
	
	public Event(String name, String detail, String ownerName) {
		this.name = name;
		this.detail=detail;
		this.ownerName=ownerName;
	}
	
	public abstract Double projectRevenue();
}