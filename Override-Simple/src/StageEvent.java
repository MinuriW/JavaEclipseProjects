public class StageEvent extends Event{
	
	private Integer noOfShows;
	private Integer noOfSeatsPerShow;
	
	public StageEvent(){}
	
	public StageEvent(String name, String detail, String ownerName,Integer noOfShows,Integer noOfSeatsPerShow)
		{
		super(name,detail,ownerName);
		this.noOfShows=noOfShows;
		this.noOfSeatsPerShow=noOfSeatsPerShow;
		}
	
	@Override
	public Double projectRevenue()
		{
		return (noOfSeatsPerShow *noOfShows * 50.00);
		}
	
	
}