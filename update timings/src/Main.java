import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		EventDAO dao = new EventDAO();
		
		List<Event> eventList = dao.getAllEvents();
		System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n","Id","Event name","Detail","Start date","End date","Organizer");
		
		for(Event e:eventList) {
			System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n",e.getId(),e.getName(),e.getDetail(),e.getStartDate(),e.getEndDate(),e.getOrganizer());
			
		}
		System.out.println("Enter the id of the event to be updated");
		Long id= sc.nextLong();
		
		System.out.println("Enter the start and end date");
//		String start = sc.nextLine();
//		String end = sc.nextLine();
		
		Event e = dao.getEventById(id);
		
		if(e != null) {
		Event updateEvent= new Event(e.getId(),e.getName(),e.getDetail(),e.getStartDate(),e.getEndDate(),e.getOrganizer()); 
		
		dao.updateEvent(updateEvent);
		e = dao.getEventById(updateEvent.getId());
		
		System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n","Id","Event name","Detail","Start date","End date","Organizer");
		
		System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n",e.getId(),e.getName(),e.getDetail(),e.getStartDate(),e.getEndDate(),e.getOrganizer());
		}
		else {
			System.out.println("Id not found");
		}
	  
	}
}