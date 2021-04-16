
public class Event {
	private String name;
    private String detail;
    private String type;
    private String organiser;
	public Event(String name, String detail, String type, String organiser) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrganiser() {
		return organiser;
	}
	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}
    
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Detail: "+ detail);
		System.out.println("Type: "+ type);
		System.out.println("Organiser: " + organiser);
		 
	}
}
