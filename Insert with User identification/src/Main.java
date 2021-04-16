import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws Exception {
		UserDAO dao = new UserDAO();
		HallDAO halldao = new HallDAO();
		User user = new User();
		List<Hall> hallList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the details of hall in csv format:");
		String details = br.readLine();
		String hallDetails[] = details.split(",");
		
		System.out.println("Enter the username:");
		while(true) {
		String username = br.readLine();
		user = dao.getUser(username);
		
		if(user == null) {
		System.out.println("Username seems to be wrong!! Enter the correct username:");
		}else {
		halldao.saveHall(new Hall(hallDetails[0],hallDetails[1],Double.parseDouble(hallDetails[2]),user));
		System.out.println("The hall details are:");
		System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Cost","Owner");
		
		hallList = halldao.getAllHall();
		for(Hall hall : hallList) {
		System.out.format("%-15s%-15s%-15s%-15s\n",hall.getName(),hall.getContactNumber(),hall.getCostPerDay(),hall.getOwner().getName());
				
		}
		break;
		}
		}
	}
}